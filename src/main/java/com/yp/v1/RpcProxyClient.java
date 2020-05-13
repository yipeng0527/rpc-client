package com.yp.v1;

import java.lang.reflect.Proxy;

/**
 * @author ex-yipeng
 * @version Id: RpcProxyClient.java, v 0.1 2020/5/13 15:35 ex-yipeng Exp $
 */
public class RpcProxyClient {

    public <T> T clientProxy(final Class<T> interfaceCls, final String host, final int port) {

        return (T) Proxy.newProxyInstance(interfaceCls.getClassLoader(), new Class[]{interfaceCls}, new RemoteInvocationHandler(host, port));
    }
}
