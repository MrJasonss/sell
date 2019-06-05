package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.dao.ProductCategoryDao;
import com.imooc.repository.ProductCategoryRepository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**

 * @Description:    类目Service实现类

 * @Author:         MrJason

 * @CreateDate:     2019/4/9 9:16 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/9 9:16 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;


    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
