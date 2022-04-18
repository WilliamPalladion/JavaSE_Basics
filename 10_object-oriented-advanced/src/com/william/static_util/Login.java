package com.william.static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        // 开发验证码
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println("验证码为: " + code);

        // 工具类定义时的要求：
        // 由于都是静态方法，直接用类名访问即可，所以工具类无需创建对象，建议直接将工具类的构造器私有 (不私有会有默认构造器)
        // WilliamUtil i = new WilliamUtil(); // 报错，因为构造器被私有化了
    }
}
