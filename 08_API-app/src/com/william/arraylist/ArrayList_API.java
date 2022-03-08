package com.william.arraylist;

import java.util.ArrayList;

public class ArrayList_API {
    public static void main(String[] args) {
        // ArrayList 常用API
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");

        // 1. public E get(int index): 返回指定索引处的元素
        String e = list.get(3);
        System.out.println(e); // MyBatis

        // 2. public int size(): 返回集合的元素个数
        System.out.println(list.size()); // 5

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 3. public E remove(int index): 删除指定索引处的元素，返回被删除的元素
        System.out.println(list);
        String e2 = list.remove(2);
        System.out.println(e2); // MySQL
        System.out.println(list);

        // 4. public boolean remove(Object o): 删除指定的元素，返回删除是否成功
        System.out.println(list.remove("MyBatis")); // true
        System.out.println(list);

        // 如果有多个重复元素只会默认删除第一个出现的该元素
        System.out.println(list.remove("Java"));
        System.out.println(list);

        // 5. public E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
        String e3 = list.set(1, "Python");
        System.out.println(e3); // Python
        System.out.println(list);
    }
}
