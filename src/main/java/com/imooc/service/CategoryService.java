package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**

 * @Description:    类目

 * @Author:         MrJason

 * @CreateDate:     2019/4/9 9:10 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/9 9:10 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface CategoryService {
    //查询一条类目
    ProductCategory findOne(Integer categoryId);
    //查询全部的类目   主要是后台使用
    List<ProductCategory> findAll();
    //根据类型来查询商品   商家所用
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    //新增类目
    ProductCategory save(ProductCategory productCategory);
}
