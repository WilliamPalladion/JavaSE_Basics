package com.william.code_block;

import java.util.ArrayList;

/** Case: 斗地主游戏
 * 需求：在启动游戏房间时，应该提前准备好54张牌，后续才可以用这些牌数据
 * 静态的ArrayList集合存储54张牌对象，静态集合只会加载一次
 * 当系统启动就需要准备好54张牌的数据，因此我们用静态代码块完成
 */

public class StaticBlock_Case {
    public static ArrayList<String> cards = new ArrayList<>();

    // 在main方法前就用静态代码块初始化
    static {
        // 点数 + 花色
        String[] size = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥", "♠", "♦", "♣"};
        
        // 遍历
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = size[i] + colors[j];
                cards.add(card);
            }
        }
        // 单独加入大小王
        cards.add("小Joker");
        cards.add("大Joker");
    }

    public static void main(String[] args) {
        // 静态代码块优先加载
        // 虽然main方法也可以实现，但静态代码块可以保证只加载一次，且更专业易读
        System.out.println("新牌：" + cards);
    }
}
