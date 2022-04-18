package com.william.polymorphic.cases;

public class Mouse implements USB{
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
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
    public void dbClick(){
        System.out.println(name + "双击");
    }
}
