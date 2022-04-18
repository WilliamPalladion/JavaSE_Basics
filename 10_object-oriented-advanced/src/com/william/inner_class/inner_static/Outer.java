package com.william.inner_class.inner_static;

/** 内部类：定义在一个类里面的类。内部类可以理解为 (寄生)，外部类可以理解为 (宿主)。

 * 使用场景和作用：
 1）当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部结构右只为外部事物服务时，那么可以用内部类来设计；
 2）内部类可以方便访问外部类的成员，包括私有的成员；
 3）内部类提供了更好的封装性：内部类可以用 private protected 等修饰 (外部类只能用public/缺省修饰)，封装性可以做更多控制

 * 分类：静态内部类、成员内部类 (非静态内部类)、局部内部类、匿名内部类

 */

public class Outer {
    public static int a = 100;
    private String hobby;

    // 1）静态内部类
    // static修饰，属于外部类本身；特点与使用和普通类完全一致，类有的成分它都有吗，只是位置在其他类中
    public static class Inner {
        private String name;
        private int age;
        public static String schoolName;

        public void show(){
            System.out.println("名称：" + name);

            // 静态内部类可以直接访问外部类的静态成员
            System.out.println(a);

            // 静态内部类不可以直接访问外部类的实例成员：外部类的实例成员必须用外部类对象访问
            // System.out.println(hobby);
            Outer o = new Outer();
            System.out.println(o.hobby);
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

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }
}
