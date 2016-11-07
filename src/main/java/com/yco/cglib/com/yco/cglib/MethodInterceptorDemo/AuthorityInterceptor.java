package com.yco.cglib.com.yco.cglib.MethodInterceptorDemo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理逻辑
 *
 * Created by yuekexin on 2016/11/7.
 */
public class AuthorityInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String methodName = method.getName();

        if ("query".equals(methodName)) {
            System.out.println("query method is ban");
            return null;
        }

        return methodProxy.invokeSuper(o, objects);
    }
}
