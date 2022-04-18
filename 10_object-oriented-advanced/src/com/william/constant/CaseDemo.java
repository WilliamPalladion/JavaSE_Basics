package com.william.constant;

import javax.swing.*;
import java.awt.event.ActionEvent;

/* Case: 开发游戏需要接收用户输入的4个方向的信号 (上下左右)
   常量用来做信息标志和分类
*/
public class CaseDemo {
    // 用常量来标记更加一目了然
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;

    public static void main(String[] args) {
        // 创建一个窗口对象
        JFrame win = new JFrame();
        // 创建一个面板对象
        JPanel panel = new JPanel();
        win.add(panel); // 窗口中放入面板

        // 创建按钮
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("下");
        JButton btn3 = new JButton("左");
        JButton btn4 = new JButton("右");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        // 显示窗口
        win.setLocationRelativeTo(null);
        win.setSize(300, 400);
        win.setVisible(true);

        // 为按钮添加关联操作 (上下左右)
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(UP);
            }
        });

        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(DOWN);
            }
        });

        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(LEFT);
            }
        });

        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(RIGHT);
            }
        });
    }

    public static void move(int flag) {
        switch (flag) {
            case UP:
                System.out.println("玛丽向上飞");
                break;
            case DOWN:
                System.out.println("玛丽往下蹲");
                break;
            case LEFT:
                System.out.println("玛丽往左跑");
                break;
            case RIGHT:
                System.out.println("玛丽往右跑");
                break;
        }
    }
}
