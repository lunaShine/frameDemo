package com.yco.cglib.BeanCopierDemo;

import net.sf.cglib.beans.BeanCopier;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class BeanCopierDemo {
    public static void main(String[] args) {
        SourceObject source = new SourceObject("source", "wait to be copy", 2);
        TargetObject target = new TargetObject();

        System.out.println(source);
        System.out.println(target);

        BeanCopier copier = BeanCopier.create(SourceObject.class, TargetObject.class, false);
        copier.copy(source, target, null);

        System.out.println(source);
        System.out.println(target);
    }
}
