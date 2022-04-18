package com.william.abstract_keyword.case_cards;

public abstract class Card {
    private String userName;
    private double money;

    // 定义一个支付方法：但每个子类的支付行为不一样，所以定义为抽象方法
    public abstract void pay(double money);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
