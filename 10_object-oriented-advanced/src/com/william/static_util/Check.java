package com.william.static_util;

import java.util.Random;

public class Check {
    public static void main(String[] args) {
        /*
        // 开发验证码
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println("验证码为: " + code);
        */

        // 问题：同一个功能多处开发，会出现代码重复度过高
        // 工具类的好处：调用方便，提高代码的复用
        System.out.println(WilliamUtil.createVerifyCode(5));

    }
}
