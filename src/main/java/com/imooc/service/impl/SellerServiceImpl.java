package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.repository.SellerInfoRepository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**

 * @Description:    实现层

 * @Author:         MrJason

 * @CreateDate:     2019/6/3 9:22 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/3 9:22 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);

    }
}
