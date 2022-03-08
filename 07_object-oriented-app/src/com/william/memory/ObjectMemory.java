package com.william.memory;

public class ObjectMemory {
    public static void main(String[] args) {
        // 两个变量指向同一个对象
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉、游戏、学习";
        s1.study();

        // 把s1变量赋值给一个Student类型的变量s2
        Student s2 = s1;
        // 存储同一个地址，指向同一个对象
        System.out.println(s2); // com.william.memory.Student@3feba861
        System.out.println(s1); // com.william.memory.Student@3feba861

        s2.hobby = "爱提问";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby); // 爱提问
        s2.study();

    }
}
