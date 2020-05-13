package com.yp.v1;

import com.yp.api.v1.IHelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();

        IHelloService helloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);

        String result = helloService.sayHello("yp");
        System.out.println(result);
    }
}
