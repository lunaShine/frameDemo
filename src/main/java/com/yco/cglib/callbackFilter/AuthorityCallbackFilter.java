package com.yco.cglib.callbackFilter;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 返回回调函数列表中的下标
 * CallbackFilter用于帮助不同的方法，执行不同的回调逻辑
 *
 * Created by yuekexin on 2016/11/7.
 */
public class AuthorityCallbackFilter implements CallbackFilter {
    public int accept(Method method) {
        if(method.getName().equals("query")) {
            //调用下标未0的回调函数
            return 0;
        }
        //调用下标为1的回调函数
        return 1;
    }
}
