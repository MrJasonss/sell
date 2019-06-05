package com.imooc.controller;


import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.OrderService;
import com.imooc.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**

 * @Description:    支付模块

 * @Author:         MrJason

 * @CreateDate:     2019/5/27 2:13 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/27 2:13 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;


    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                      @RequestParam("returnUrl") String returnUrl,
                      Map<String,Object> map
                      ){
        //1. 查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO ==null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        //如果存在  就发起支付
        PayResponse payResponse = payService.create(orderDTO);

        map.put("payResponse",payResponse);
        map.put("returnUrl",returnUrl);
        return new ModelAndView("pay/create" ,map);
    }

    /*
        微信消息异步通知
     */

    @PostMapping("notify")
    public ModelAndView notify(@RequestBody String notifyData){
        payService.notify(notifyData);
        return new ModelAndView("pay/success");
    }


}
