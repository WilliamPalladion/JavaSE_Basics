package com.william.arraylist;

// Case 2: 集合存储自定义类型的对象
// 某影院系统需要在后台存储3部电影，然后依次展示出来 (定义一个电影类，创建对象封装数据，用集合存储电影对象)

import java.util.ArrayList;

public class ArrayList_Case2 {
    public static void main(String[] args) {
        // 创建电影类型的集合
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯"));
        System.out.println(movies); // 输出的是3个对象的地址

        // 遍历展示信息
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("电影名称: " + m.getName());
            System.out.println("电影得分: " + m.getScore());
            System.out.println("电影主演: " + m.getActor());
        }
    }
}
