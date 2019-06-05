package com.imooc.enums;

import lombok.Getter;

/**

 * @Description:    支付状态枚举类

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 2:01 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 2:01 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Getter
public enum PayStatusEnum implements CodeEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
