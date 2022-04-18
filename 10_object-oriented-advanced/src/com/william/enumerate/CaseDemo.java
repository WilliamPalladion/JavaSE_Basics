package com.william.enumerate;

import javax.swing.*;
import java.awt.event.ActionEvent;

/* Case: 开发游戏需要接收用户输入的4个方向的信号 (上下左右)
   之前选择用常量做信息标志和分类：虽然可以实现可读性，但入参值不受约束，代码相对不够严谨
   枚举做信息标志和分类：代码可读性好，入参约束严谨，代码优雅，是最好的信息分类技术！
   Note: 如果是为了表示具体的数据值，还是使用常量；如果只是需要分类，建议用枚举
*/
public class CaseDemo {
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
                move(Orientation.UP); // 现在传参只能传枚举类中的限定的实例对象，限定了入参
            }
        });

        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(Orientation.DOWN);
            }
        });

        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(Orientation.LEFT);
            }
        });

        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(Orientation.RIGHT);
            }
        });
    }

    public static void move(Orientation o) {
        // switch分支自动匹配了枚举类的实例对象
        switch (o) {
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
