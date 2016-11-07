package com.yco.cglib.BeanCopierDemo;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class SourceObject {
    private String name;
    private String description;
    private int num;

    public SourceObject() {
    }

    public SourceObject(String name, String description, int num) {
        this.name = name;
        this.description = description;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SourceObject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", num=" + num +
                '}';
    }
}
