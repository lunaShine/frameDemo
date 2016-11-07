package com.yco.cglib.MixinDemo;

import net.sf.cglib.proxy.Mixin;

/**
 * Mixin用于解决多继承问题，将多个类融合为一个代理类
 * <p>
 * Created by yuekexin on 2016/11/7.
 */
public class MixinTest {
    public static void main(String[] args) {
        //顺序要求一致
        Class<?>[] interfaces = new Class[]{AppleInterface.class, PenInterface.class};
        Object[] delegates = new Object[]{new AppleImpl(), new PenImpl()};

        Object obj = Mixin.create(interfaces, delegates);

        ((PenInterface) obj).printPen();

        ((AppleInterface) obj).printApple();
    }
}
