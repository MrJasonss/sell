package com.imooc.VO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**

 * @Description:    商品（包含类目）

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 10:42 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 10:42 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO>  productInfoVOList;
}
