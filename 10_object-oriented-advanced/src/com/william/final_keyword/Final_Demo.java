package com.william.final_keyword;

public class Final_Demo {
    public static void main(String[] args) {
        // final 关键字： 表最终，可以修饰 (类，方法，变量):
        // 1）修饰类：表明该类是最终类，不能被继承；
        // 2）修饰方法：表明该方法是最终方法，不能被重写；
        // 3）修饰变量：表明该变量第一次赋值后，不能再次被赋值 (能且仅能被赋值一次)
    }
}


// 1. final 修饰类：表明该类是最终类，不能被继承；
final class Animal{
}

// class Wolf extends Animal{ } // 报错


// 2. final 修饰方法：表明该方法是最终方法，不能被重写；
class People{
    public final void eat(){
        System.out.println("人都要吃东西");
    }
}

class Student extends People{
    /*
    @Override
    public void eat() {
        System.out.println("学生吃的很多");
    }
    */
}