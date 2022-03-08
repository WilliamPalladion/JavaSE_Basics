package com.william.branch;

public class Switch_Note {
    public static void main(String[] args) {
        // Switch Note:
        // 1）表达式类型只能是byte, short, int, char, JDK5开始支持枚举，JDK7开始支持String
        //    不支持double, float, long
        double a = 0.1 + 0.2;
        System.out.println(a); // 结果不是0.3，所以不能匹配double, float

        // 2）Case给出的值不允许重复，且只能是字面量，不能是变量
        int a1 = 30;
        switch (3) {
            case 21:
                System.out.println("not paired");
                break;
            /*case a1: // 报错，不能使用变量作为case值
                System.out.println("wrong case");
                break;
            */
        }

        // 3）不要忘记写break，否则会出现穿透现象
        String weekday = "周三";
        switch (weekday) {
            case "周一":
                System.out.println("写代码");
                break;
            case "周二":
                System.out.println("找大牛帮忙");
                break;
            case "周三":
                System.out.println("吃饭");
                // break;
            case "周四":
                System.out.println("吃鸡");
                // break;
            case "周五":
                System.out.println("相亲");
                break;
            default:
                System.out.println("数据有误！");
        }
        // 穿透现象：会连续输出 “吃饭” “吃鸡” “相亲”，直到遇到break语句才停止

        // 利用穿透现象也可以实现一些有趣的功能
        // Case: 用户输入月份可以展示该月份的天数
        // 1 3 5 7 8 10 12为31天，4 6 9 11 为30天，2月闰年为29天，非闰年为28天
        int month = 7;
        switch (month) {
            case 1:
                System.out.println(month + "是31天");
                break;
            case 3:
                System.out.println(month + "是31天");
                break;
            case 5:
                System.out.println(month + "是31天");
                break;
            case 7:
                System.out.println(month + "是31天");
                break;
            case 8:
                System.out.println(month + "是31天");
                break;
            // ... 一个一个写来匹配
        }

        // 但利用穿透性来写可以大大简化代码
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月是30天");
                break;
            case 2:
                System.out.println(month + "月闰年是29天，非闰年是28天");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
