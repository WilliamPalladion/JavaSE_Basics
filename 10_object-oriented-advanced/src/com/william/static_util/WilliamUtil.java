package com.william.static_util;

/*
工具类：类中都是一些静态方法，每个方法都以完成一个共用的功能为目的，这个类用来给系统开发人员共同使用
*/

import java.util.Random;

public class WilliamUtil {
    // 工具类定义时的要求：
    // 由于都是静态方法，直接用类名访问即可，所以工具类无需创建对象，建议直接将工具类的构造器私有 (不私有会有默认构造器)
    private WilliamUtil(){
    }

    // 定义一个工具类 (静态方法) 来生成验证码
    public static String createVerifyCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
