package com.william.interface_keyword.sports_case;

// 接口可以被类单实现，也可以被类多实现
public class PingPongMan implements SportMan, Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // alt + enter 方法重写
    @Override
    public void run() {
        System.out.println(name + "必须跑步训练");
    }

    @Override
    public void competition() {
        System.out.println(name + "要参加比赛");
    }

    // 多实现
    @Override
    public void rule() {
        System.out.println(name + "必须遵纪守法");
    }
}
