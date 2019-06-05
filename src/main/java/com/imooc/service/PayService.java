package com.imooc.service;


import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundRequest;
import com.lly835.bestpay.model.RefundResponse;

/**

 * @Description:    支付服务层

 * @Author:         MrJason

 * @CreateDate:     2019/5/27 2:19 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/27 2:19 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund (OrderDTO orderDTO);

}
