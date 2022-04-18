package com.william.static_keyword;

public class StaticField {
    public static void main(String[] args) {
        // static: 静态，可以修饰成员变量和成员方法
        // static 修饰成员变量表示该成员变量只在内存中存储一份(属于类)，可以被共享访问、修改
        // 访问方式：className.static_var
        System.out.println(User.onlineNumber); // 161

        // 也可以用 instance.static_var (不推荐)
        User u = new User();
        u.onlineNumber++; // 加入一个人
        System.out.println(u.onlineNumber); // 162

    }
}
