package com.william.param;

public class Method_ParamMechanism {
    public static void main(String[] args) {
        // Java的参数传递机制：值传递
        // 在传输实参给方法的形参的时候，并不是传输实参变量本身，而是实参中存储的值(值传递)

        // 1. 基本类型的参数传递
        int a = 10;
        change(a); // 传递的是a变量中的值10，相当于change(10)
        System.out.println(a); // 10, 形参的改变不影响实参

        // 2. 引用类型的参数传递
        int[] arrs = {10, 20, 30};
        change1(arrs); // 传递的是数组的地址，相当于 change([I@4c873330)
        System.out.println(arrs[1]); // 222, 引用类型形参的改变就影响了实参
    }

    public static void change(int a){
        System.out.println(a); // 10
        a = 20; // 这里修改的是形参
        System.out.println(a); // 20
    }

    // 引用类型传递的就是数组的地址了，所以形参也是根据地址去访问数组，它的变化也会影响实参
    public static void change1(int[] arrs){
        System.out.println(arrs[1]); // 20
        arrs[1] = 222;
        System.out.println(arrs[1]); // 222
    }

}
