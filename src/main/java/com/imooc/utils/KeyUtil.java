package com.imooc.utils;


import java.util.Random;

/**

 * @Description:    生成唯一的主键  用来当作订单的ID  格式   时间+随机数

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 10:33 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 10:33 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public class KeyUtil {
    //synchronized  多线程  避免重复
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        //生成6为随机数
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);

    }
}
