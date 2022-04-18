package com.william.inner_class.inner_member;

public class Outer {
    public static int num = 111;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    // 2）成员内部类
    // 无static修饰，属于外部类的对象
    public class Inner {
        private String name;
        private int age;
        // JDK 16 前，成员内部类中不能定义静态成员 (因为静态成员应该属于类，而不是对象)
        public static int a;

        // 静态方法
        public static void test(){

        }

        // 实例方法
        public void show(){
            System.out.println("名称：" + name);

            // 1）成员内部类可以直接访问外部类的静态成员
            System.out.println("数量：" + num);

            // 2）成员内部类可以直接访问外部类的实例成员：因为必须先有外部类对象，才有成员内部类对象，所以可以直接访问
            System.out.println("爱好：" + hobby);
        }

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
