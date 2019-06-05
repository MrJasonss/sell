package com.imooc.utils;

import org.apache.http.HttpResponse;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**

 * @Description:    cookie 工具类

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 11:16 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 11:16 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


public class CookieUtil {

    /**
     *
     * @param response
     * @param name
     * @param value
     * @param maxAge
     */
    public static void set(HttpServletResponse response,
                           String name,
                           String value,
                           int maxAge){
        Cookie cookie = new Cookie("token",value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    public static Cookie get(HttpServletRequest request,String name){
        Map<String,Cookie> cookieMap = readCookieMap(request);
        if(cookieMap.containsKey(name)){
            return cookieMap.get(name);
        }else {
            return null;
        }
    }
    private static Map<String,Cookie> readCookieMap(HttpServletRequest request){
        Map<String,Cookie> cookieMap = new HashMap<>();

        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies)
                cookieMap.put(cookie.getName(),cookie);
        }
        return cookieMap;

    }
}
