package com.imooc.repository;


import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**

 * @Description:    卖家数据层

 * @Author:         MrJason

 * @CreateDate:     2019/6/3 9:03 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/3 9:03 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
