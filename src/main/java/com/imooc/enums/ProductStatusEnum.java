package com.imooc.enums;

import com.imooc.utils.EnumUtil;
import lombok.Getter;

/**

 * @Description:    商品枚举状态

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 9:45 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 9:45 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message =message;
    }

}
