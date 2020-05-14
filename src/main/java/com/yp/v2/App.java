package com.yp.v2;

import com.yp.api.v2.IPaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient = context.getBean(RpcProxyClient.class);

        IPaymentService paymentService = rpcProxyClient.clientProxy(IPaymentService.class,
                "localhost", 8080);
        paymentService.doPay();
    }
}
