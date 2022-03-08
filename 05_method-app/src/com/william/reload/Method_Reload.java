package com.william.reload;

import java.io.OutputStream;

public class Method_Reload {
    public static void main(String[] args) {
        // 方法重载：
        // 同一个类中，出现多个方法名称相同，但是形参列表不同，那么这些方法就是重载方法
        // 调用方法时，会根据参数的不同来区分调用的是哪个方法

        // Case：开发武器系统有如下功能
        // 1) 可以默认发射一枚武器
        // 2) 可以指定地区发射一枚武器
        // 3) 可以指定地区发射多枚武器
        fire();
        fire("Japan");
        fire("Japan", 1000);

        // Java官方也有使用方法重载的例子
        // OutputStream os = null;
        // os.write();
    }

    public static void fire(){
        System.out.println("默认发射一枚给米国");
        // 甚至我们可以直接在方法内调用重载方法，代码更简洁
        // fire("米国");
    }

    public static void fire(String location){
        System.out.println("默认发射一枚给" + location);
        // fire(location, 1);
    }

    public static void fire(String location, int number){
        System.out.println("默认发射" + number + "枚武器给" + location);
    }
}
