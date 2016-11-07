package com.yco.cglib.BeanCopierDemo;

/**
 * Created by yuekexin on 2016/11/7.
 */
public class TargetObject {
    private String name;
    private String description;
    private String function;

    public TargetObject() {
    }

    public TargetObject(String name, String description, String function) {

        this.name = name;
        this.description = description;
        this.function = function;
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "TargetObject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", function='" + function + '\'' +
                '}';
    }
}
