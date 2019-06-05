package com.imooc.constant;


import org.springframework.data.redis.core.StringRedisTemplate;

/**

 * @Description:    redis常量

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 10:51 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 10:51 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public interface RedisContant {
    String TOKEN_PREFIX = "token_%s";
    Integer EXPIRE = 7200;// 2小时
}
