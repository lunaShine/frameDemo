package com.yco.cglib.callbackFilterDemo;

import com.yco.cglib.Authority;
import com.yco.cglib.methodInterceptorDemo.AuthorityInterceptor;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class CallbackFilterTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置被代理类
        enhancer.setSuperclass(Authority.class);

        //设置回调函数列表
        enhancer.setCallbacks(new Callback[]{new AuthorityInterceptor(), NoOp.INSTANCE});

        //设置选择回调函数的类
        enhancer.setCallbackFilter(new AuthorityCallbackFilter());

        //产生代理对象
        Authority authority = ((Authority)enhancer.create());

        authority.query();
        authority.update();
    }
}
