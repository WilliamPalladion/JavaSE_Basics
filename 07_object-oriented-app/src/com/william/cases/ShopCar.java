package com.william.cases;

import java.util.Scanner;

/* Case: 购物车模块模拟架构搭建
   需求：模拟购物车模块的功能，实现添加商品到购物车中，同时修改商品数量和结算商品价格
   分析：购物车的每个商品都是一个对象，需要定义一个商品类；
        购物车本身也是一个对象，可以使用数组对象代表它;
        完成页面架构，让用户选择操作的功能
*/
public class ShopCar {
    public static void main(String[] args) {
        // 定义商品类和购物车对象
        // 这里的数组装的都是指向对象的变量 (地址)
        Goods[] shopCar = new Goods[100]; // [null, null, ...]

        // 搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车的商品：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算商品金额：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------");
            System.out.println("请您输入命令：");
            String command = sc.next();

            switch (command){
                case "add":
                    addGoods(shopCar, sc); // alt + enter 快速创建方法
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                default:
                    System.out.println("请输入正确命令！");
            }
        }
    }

    // 让用户输入商品信息，并加入到购物车中去，且可查看购物车信息
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请您输入商品的id:");
        int id = sc.nextInt();
        System.out.println("请您输入商品的名称：");
        String name = sc.next();
        System.out.println("请您输入购买商品的价格:");
        double price = sc.nextDouble();
        System.out.println("请您输入购买商品的数量:");
        int buyNumber = sc.nextInt();

        // 把商品的信息封装成一个对象，添加到购物车数组中去
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                // 说明此位置无元素，可以添加
                shopCar[i] = g;
                break; // 成功存入不需要继续循环
            }
        }
        System.out.println("商品成功添加到购物车");

    }

    // 查询购物车中的商品信息对象，并展示出来
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("==========查询购物车信息如下===========");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");

        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                // 展示商品信息
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t" + g.buyNumber);
            } else {
                break;
            }
        }
    }

    // 用户输入商品id，修改商品购买的数量
    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        // 首先要根据id查询出要修改的商品对象
        while (true) {
            System.out.println("请您输入要修改的商品id：");
            int id = sc.nextInt();
            Goods g = getGoods(shopCar, id);
            if (g == null){
                System.out.println("对不起，您没有添加该商品到购物车中！");
            } else {
                System.out.println("请您输入" + g.name + "最新的购买数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static Goods getGoods(Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                if (g.id == id){
                    return g;
                }
            } else {
                return null;
            }
        }
        return null; // 没有匹配到商品
    }

    public static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                sum += (g.price * g.buyNumber);
            } else {
                break;
            }
        }
        System.out.println("订单总金额为：" + sum);
    }

}

