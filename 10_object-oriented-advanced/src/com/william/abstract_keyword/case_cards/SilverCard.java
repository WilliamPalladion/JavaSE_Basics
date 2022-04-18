package com.william.abstract_keyword.case_cards;

public class SilverCard extends Card {
    @Override
    public void pay(double money) {
        System.out.println("您当前消费：" + money);
        System.out.println("您当前卡片的余额为：" + getMoney());

        // 优惠价
        double rs = money * 0.85;
        System.out.println(getUserName() + "：您实际支付：" + rs);

        // 更新余额
        setMoney(getMoney() - rs);
    }
}
