package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**

 * @Description:    项目中的地址

 * @Author:         MrJason

 * @CreateDate:     2019/6/3 11:27 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/3 11:27 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrl {
    /**
     * 微信公众平台 授权URL；
     */
    public String wechatMpAuthorize;


    /**
     * 微信开放平台授权url
     */

    public String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    public String sell;
}
