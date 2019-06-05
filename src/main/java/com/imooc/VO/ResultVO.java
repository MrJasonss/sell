package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**

 * @Description:    http请求返回的最外层对象

 * @Author:         MrJason
 *
 * @CreateDate:     2019/4/10 10:32 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 10:32 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
@Data

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO <T>{
    /* 错误代码*/
    private  Integer code;
    /* 提示信息*/
    private  String msg = "";
    /* 具体内容*/
    private T data;

}
