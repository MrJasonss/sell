package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**

 * @Description:    商品详情

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 10:45 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 10:45 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String producName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
