package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**

 * @Description:    防止不安全的业务逻辑  买家 实现类

 * @Author:         MrJason

 * @CreateDate:     2019/4/14 4:03 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/14 4:03 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private  OrderService orderService;
    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
       return checkOrderOwner(openid,orderId);
    }

    @Override
    public OrderDTO cancelOrderOne(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid,orderId);
        if(orderDTO==null){
            log.error("【取消订单】  查不到订单,orderId={}",orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        return orderService.cancel(orderDTO);
    }


    public OrderDTO checkOrderOwner(String openid,String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO==null){
            return  null;
        }
        //判断是否是自己的订单
        if(orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)){
            log.error("【查询订单】订单的openid不一致。openid={},orderDTO={}",openid,orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
