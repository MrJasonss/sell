package com.imooc.utils;


import com.imooc.enums.CodeEnum;

/**

 * @Description:    枚举的工具类

 * @Author:         MrJason

 * @CreateDate:     2019/5/30 9:45 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/30 9:45 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public class EnumUtil {

    public static <T extends CodeEnum> T  getByCode (Integer code, Class<T> enumClass){
        for(T each : enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
