package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**

 * @Description:    订单详情

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 3:58 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 3:58 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
