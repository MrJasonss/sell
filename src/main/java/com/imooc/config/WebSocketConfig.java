package com.imooc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


/**

 * @Description:    websocket 配置

 * @Author:         MrJason

 * @CreateDate:     2019/6/4 9:27 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/4 9:27 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

@Component

public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
