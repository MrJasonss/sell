package com.imooc.service;


import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**

 * @Description:    订单服务层

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 4:43 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 4:43 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


public interface OrderService {
    /*创建订单*/
    OrderDTO create(OrderDTO orderDTO);
    /*查询单个订单*/
    OrderDTO findOne(String orderId);
    /*查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    /*取消订单*/
    OrderDTO cancel(OrderDTO orderDTO);
    /*完成订单*/
    OrderDTO finish(OrderDTO orderDTO);
    /*支付订单*/
    OrderDTO paid(OrderDTO orderDTO);
    /*查询订单列表*/
    Page<OrderDTO> findList(Pageable pageable);

}
