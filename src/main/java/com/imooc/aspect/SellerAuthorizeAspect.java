package com.imooc.aspect;


import com.imooc.constant.CookieContant;
import com.imooc.constant.RedisContant;
import com.imooc.exception.SellException;
import com.imooc.exception.SellerAuthorizeException;
import com.imooc.utils.CookieUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**

 * @Description:    java类作用描述

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 5:04 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 5:04 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

@Aspect
@Component
@Slf4j
public class SellerAuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;


    @Pointcut("execution(public * com.imooc.controller.Seller*.*(..))"+
    "&& !execution(public * com.imooc.controller.SellerUserController.*(..))")
    public void verify(){

    }
    @Before("verify()")
    public void doVerify(){
         ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
         HttpServletRequest request = attributes.getRequest();
         //查询cookie
        Cookie cookie = CookieUtil.get(request, CookieContant.TOKEN);
        if(cookie == null){
            log.warn("【登陆校验cookie中查不到token】");
            throw new SellerAuthorizeException();
        }

        //去redis中查找
        String tokenValue = redisTemplate.opsForValue().get(String.format(RedisContant.TOKEN_PREFIX,cookie.getValue()));
        if(StringUtils.isEmpty(tokenValue)){
            log.warn("【登陆校验Redis中查不到token】");
            throw new SellerAuthorizeException();
        }

    }

}
