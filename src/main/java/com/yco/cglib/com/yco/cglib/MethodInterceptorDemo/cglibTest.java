package com.yco.cglib.com.yco.cglib.MethodInterceptorDemo;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class cglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置被代理类
        enhancer.setSuperclass(Authority.class);
        //设置代理逻辑类
        enhancer.setCallback(new AuthorityInterceptor());
        //产生代理对象
        Authority authority = ((Authority)enhancer.create());

        authority.query();
        authority.update();
    }
}
