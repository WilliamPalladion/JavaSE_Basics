package com.william.inner_class.inner_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Case: 匿名内部类使用的真实场景
 * 通过GUI编程和匿名内部类，为按钮添加功能
 */
public class GUI_Case {
    public static void main(String[] args) {
        // 创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        // 创建按钮对象
        JButton btn = new JButton("登陆");

        // 匿名内部类的应用
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win, "点击我");
            }
        });

        // 匿名内部类甚至可以简化成下面的形式：
        // btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "点击我"));

        // 把按钮对象添加到窗口展示
        panel.add(btn);

        // 展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
