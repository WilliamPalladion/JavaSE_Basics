package com.william.polymorphic.cases;

public class Keyboard implements USB{
    private String name;

    public Keyboard() {
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 共享功能，通过接口实现
    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");
    }

    @Override
    public void disconnect() {
        System.out.println(name + "成功拔出电脑");
    }

    // 独有功能
    public void keyDown(){
        System.out.println(name + "敲击");
    }
}
