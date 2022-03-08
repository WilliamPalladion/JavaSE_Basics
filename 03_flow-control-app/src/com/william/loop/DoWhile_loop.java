package com.william.loop;

public class DoWhile_loop {
    public static void main(String[] args) {
        // do { 循环体语句; 迭代语句; } while (循环条件);
        // Case 1: 输出3次Hello World
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i < 3);
    }
}
