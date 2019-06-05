package com.imooc.form;


import com.imooc.enums.ProductStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

/**

 * @Description:    商品表单提交的字段

 * @Author:         MrJason

 * @CreateDate:     2019/5/31 2:46 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/31 2:46 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


@Data
public class ProductForm {
    @Id
    private String productId;
    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;



    /** 类目编号. */
    private Integer categoryType;
}
