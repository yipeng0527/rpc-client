package com.yp.v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ex-yipeng
 * @version Id: SpringConfig.java, v 0.1 2020/5/14 13:28 ex-yipeng Exp $
 */
@Configuration
public class SpringConfig {

    @Bean(name = "rpcProxyClient")
    public RpcProxyClient proxyClient() {
        return new RpcProxyClient();
    }
}
