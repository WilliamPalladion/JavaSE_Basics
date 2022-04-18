package com.william.static_keyword;

public class User {
    // 静态成员变量 (只在内存中有一份，可以被共享), 常表示被共享的信息，可以被共享访问
    public static int onlineNumber = 161;

    // 实例成员变量 (无 static 修饰，存在于每个对象中): 常表示姓名、年龄等属于每个对象的信息
    private String name;
    private int age;

    // 我们直接在类中研究
    public static void main(String[] args) {
        // static: 静态，可以修饰成员变量和成员方法
        // static 修饰成员变量表示该成员变量只在内存中存储一份(属于类)，可以被共享访问、修改
        // 访问方式：className.static_var
        System.out.println(User.onlineNumber); // 161

        // 也可以用 instance.static_var (不推荐)
        User u = new User();
        u.onlineNumber++; // 加入一个人
        System.out.println(u.onlineNumber); // 162
        System.out.println(onlineNumber); // 同一个类中访问静态成员变量可以省略类名

        // 对于实例成员变量，我们只能以 instance.var 来访问成员变量
        u.name = "张三";
        u.age = 21;



    }
}
