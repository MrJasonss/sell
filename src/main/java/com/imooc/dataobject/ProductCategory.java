package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**

 * @Description:    类目

 * @Author:         MrJason

 * @CreateDate:     2019/4/9 5:23 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/9 5:23 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id. */
    @Id  //主键
    @GeneratedValue //自增长
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }


    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
