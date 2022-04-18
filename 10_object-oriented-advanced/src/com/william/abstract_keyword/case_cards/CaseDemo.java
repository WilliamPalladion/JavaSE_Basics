package com.william.abstract_keyword.case_cards;

/* Case: 抽象类/方法的应用
加油站两种充值卡：金卡预存10000，8折优惠；银卡预存5000，8.5折优惠；
两种卡片需要包含主人名称、余额、支付功能
*/

public class CaseDemo {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("william");

        c.pay(300);
        System.out.println("剩余：" + c.getMoney());
    }
}
