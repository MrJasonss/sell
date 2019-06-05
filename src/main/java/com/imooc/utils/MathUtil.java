package com.imooc.utils;


/**

 * @Description:    控制金额的精度

 * @Author:         MrJason

 * @CreateDate:     2019/5/28 10:17 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/28 10:17 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;
    public static Boolean equals(Double d1,Double d2){
        Double result = Math.abs(d1-d2);
        if(result<MONEY_RANGE){
            return true;
        }else {
            return false;
        }
    }
}
