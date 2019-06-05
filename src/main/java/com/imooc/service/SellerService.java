package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**

 * @Description:    卖家端借口

 * @Author:         MrJason

 * @CreateDate:     2019/6/3 9:19 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/3 9:19 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


public interface SellerService {
    /**
     * 通过openid查询卖家信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
