package com.imooc.utils;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**

 * @Description:    Json格式化工具

 * @Author:         MrJason

 * @CreateDate:     2019/5/27 3:12 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/5/27 3:12 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return  gson.toJson(object);
    }


}
