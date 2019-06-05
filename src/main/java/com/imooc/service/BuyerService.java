package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**

 * @Description:    防止不安全的业务逻辑  买家

 * @Author:         MrJason

 * @CreateDate:     2019/4/14 3:54 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/14 3:54 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);
    //取消一个订单
    OrderDTO cancelOrderOne(String openid,String orderId);


}
