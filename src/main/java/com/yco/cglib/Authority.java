package com.yco.cglib;

/**
 * 被代理的权限基类
 *
 * Created by yuekexin on 2016/11/7.
 */
public class Authority {
    public void query() {
        System.out.print("you have ability to query");
    }

    public void update() {
        System.out.print("you have ability to update");
    }
}
