package com.william.arraylist;

import java.util.ArrayList;

public class ArrayList_Create {
    public static void main(String[] args) {
        // ArrayList集合：集合的一种，支持索引
        // public ArrayList(); // 创建一个空的集合对象
        // 添加元素
        // public boolean add(E e): 将指定元素插入到集合的末尾
        // public void add(int index, E element): 在集合的指定位置插入指定元素
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("java");
        list.add("MySQL");
        list.add(23);
        list.add(false);
        System.out.println(list.add("中")); // true -> 添加成功

        // ArrayList内部存储的仍然是地址，但内部通过继承会根据地址访问对象进行输出
        System.out.println(list); // [java, java, MySQL, 23, false, "中"]

        list.add(1, "william");
        System.out.println(list); // [java, william, java, MySQL, 23, false, 中]

        // ArrayList 对泛型的支持:
        // ArrayList<E>: 泛型类，可以在编译阶段约束集合对象只能操作某种数据类型
        // e.g. ArrayList<String> (字符串类型); ArrayList<Integer> (整数类型)
        // 注意：<>中只能存储引用类型，不支持基本数据类型 (int, short, ... -> Integer)

        // ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>(); // JDK 1.7 开始泛型后面的类型申明不写
        list1.add("Java");
        list1.add("MySQL");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(24);
        list2.add(100);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(11.5);
        list3.add(24.6);

        // 如果真的要添加所有类型的话，可以写 ArrayList<Object>
    }
}
