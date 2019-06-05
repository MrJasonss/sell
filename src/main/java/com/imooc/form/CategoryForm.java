package com.imooc.form;

import lombok.Data;

/**

 * @Description:    类目表单

 * @Author:         MrJason

 * @CreateDate:     2019/5/31 10:11 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/31 10:11 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
