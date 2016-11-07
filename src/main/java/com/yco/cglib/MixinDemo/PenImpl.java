package com.yco.cglib.MixinDemo;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class PenImpl implements PenInterface {
    public void printPen() {
        System.out.println("I have a pen");
    }
}
