package com.wsy.strategydemo.abstracts;

public abstract class CoderAbstract {

    private String name;

    public CoderAbstract setName(String name) {
        this.name = name;
        return this;
    }

    public void work() {
        System.out.printf(name + "上班敲代码。。。");
    }

    public void rest() {
        System.out.println(name + "休息睡觉。。。");
    }
}
