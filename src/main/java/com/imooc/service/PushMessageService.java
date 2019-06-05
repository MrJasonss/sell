package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**

 * @Description:    消息推送

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 8:42 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 8:42 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface PushMessageService {

    /**
     * 订单状态变更消息通知
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
