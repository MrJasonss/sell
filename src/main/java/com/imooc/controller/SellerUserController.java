package com.imooc.controller;

import com.imooc.config.ProjectUrl;
import com.imooc.config.ProjectUrlConfig;
import com.imooc.constant.CookieContant;
import com.imooc.constant.RedisContant;
import com.imooc.dataobject.SellerInfo;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.SellerService;
import com.imooc.utils.CookieUtil;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**

 * @Description:    卖家信息管理

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 9:31 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 9:31 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Controller
@RequestMapping("/seller")
public class SellerUserController {
    @Autowired
    private SellerService sellerService;


    @Autowired
    private StringRedisTemplate redisTemplate;


    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam ("openid") String openid, Map<String,Object> map, HttpServletResponse response){
        //1.openid 去数据库里和数据库里的数据做匹配
        SellerInfo sellerInfo = sellerService.findSellerInfoByOpenid(openid);
        if(sellerInfo ==null){
            map.put("msg", ResultEnum.LOGIN_FAIL.getMessage());
            map.put("url","/sell/seller/order/list");
            return new ModelAndView("common/error");
        }

        //2.设置token到redis
        String token = UUID.randomUUID().toString();
        Integer expire  = RedisContant.EXPIRE;
        redisTemplate.opsForValue().set(String.format(RedisContant.TOKEN_PREFIX,token),openid,expire, TimeUnit.SECONDS);


        //3.设置token到cookie
        CookieUtil.set(response, CookieContant.TOKEN,token,expire);

        return  new ModelAndView("redirect:"+projectUrlConfig.getSell()+"/sell/seller/order/list");


    }


    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request,HttpServletResponse response,Map<String,Object> map){
         //1.从cookie中查询
        Cookie cookie = CookieUtil.get(request,CookieContant.TOKEN);
        if(cookie != null){
            //2.清楚redis
            redisTemplate.opsForValue().getOperations().delete(String.format(RedisContant.TOKEN_PREFIX,cookie.getValue()));
            //3.清楚cookie
            CookieUtil.set(response,CookieContant.TOKEN,null,0);
        }

         map.put("msg",ResultEnum.LOGOUT_SUCCESS.getMessage());
         map.put("url","/sell/seller/order/list");
         return new ModelAndView("common/success",map);
    }
}
