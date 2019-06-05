package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**

 * @Description:    订单管理

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 3:51 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 3:51 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
