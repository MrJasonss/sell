package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Getter;


/**

 * @Description:    异常类

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 10:22 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 10:22 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Getter
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }


    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
