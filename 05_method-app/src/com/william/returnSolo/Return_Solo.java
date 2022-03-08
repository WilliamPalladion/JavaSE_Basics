package com.william.returnSolo;

public class Return_Solo {
    public static void main(String[] args) {
        // return 关键字的单独使用
        // 可以立即跳出并结束当前方法的执行; return关键字单独使用可以放在任何方法中
        divide(10, 0);
    }

    public static void divide(int a, int b){
        // 如果 b = 0 会有问题
        if (b == 0) {
            System.out.println("您的数据有问题，除数不能为0");
            return; // 立即结束当前方法的执行
        }
        int c = a / b;
        System.out.println("结果为：" + c);
    }
}
