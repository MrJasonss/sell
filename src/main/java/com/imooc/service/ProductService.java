package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**

 * @Description:    商品

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 9:39 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 9:39 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface ProductService {
    ProductInfo findOne(String productId);
    /*查询在架的商品列表*/
    List<ProductInfo> findUpAll();
    /*分页查找*/
    Page<ProductInfo> findAll(Pageable pageable);
    /*新增*/
    ProductInfo save(ProductInfo productInfo);
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减少库存
    void decreaseStock(List<CartDTO> cartDTOList);
    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
