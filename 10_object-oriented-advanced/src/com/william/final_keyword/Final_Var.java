package com.william.final_keyword;

public class Final_Var {
    public static void main(String[] args) {
        // 3）final 修饰变量：表明该变量第一次赋值后，不能再次被赋值 (能且仅能被赋值一次)
        // 变量：1）局部变量
        //      2）成员变量：实例成员变量、静态成员变量

        // final修饰局部变量，防止在运算中被改变
        final double rate = 3.14;
        // rate = 3.19;

        buy(0.8); // 这里就相当于第一次赋值

        // schoolName = "St. Johns"; 报错，被final修饰就不能被更改了

        Final_Var t = new Final_Var();
        System.out.println(t.name);
        // t.name = "test2"; 报错
        
        final Teacher t2 = new Teacher("学习，授课");
        // t2 = null; 报错，不能赋值给final变量
        // 但我们可以直接改动引用类型变量指向对象的值
        System.out.println(t2.getHobby());
        t2.setHobby("运动");
        System.out.println(t2.getHobby());
    }

    // 在方法中也可以定义final修饰的局部变量，防止被内部改变
    public static void buy(final double z){
        // z = 0.1;
    }

    // final修饰静态成员变量 (i.e. 常量)
    public static final String schoolName = "william";

    // final修饰实例成员变量 (几乎不用，这会导致每个对象的名字都是一样的)
    private final String name = "test";
}

// final 注意事项：
// 1）final 修饰基本类型：变量存储的 数据值 不变；
// 2）final 修饰引用类型：变量存储的 地址值 不变，但是地址指向的对象内容是可以发生变化的

class Teacher{
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
