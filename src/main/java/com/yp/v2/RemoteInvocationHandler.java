package com.yp.v2;

import com.yp.api.v1.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ex-yipeng
 * @version Id: RemoteInvocationHandler.java, v 0.1 2020/5/13 15:35 ex-yipeng Exp $
 */
public class RemoteInvocationHandler implements InvocationHandler {

    private String host;

    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("com in");

        RpcRequest request = new RpcRequest();
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameters(args);

        RpcNetTransport netTransport = new RpcNetTransport(host, port);
        Object result = netTransport.send(request);
        return result;
    }
}
