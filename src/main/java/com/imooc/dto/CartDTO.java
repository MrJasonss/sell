package com.imooc.dto;

import lombok.Data;

/**

 * @Description:  购物车

 * @Author:         MrJason

 * @CreateDate:     2019/4/11 9:42 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/11 9:42 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

@Data
public class CartDTO {
    /*商品Id*/
    private  String productId;

    /*商品数量*/
    private  Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
