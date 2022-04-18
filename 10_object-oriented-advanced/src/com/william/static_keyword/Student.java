package com.william.static_keyword;

public class Student {
    private String name; // 实例成员变量

    // 静态成员方法 (static修饰，归属于类)：可以共享访问，建议用类名访问
    public static int getMax(int age1, int age2){
        return age1 > age2 ? age1 : age2;
    }

    // 实例成员方法 (无static修饰，归属于对象): 只能用对象访问
    public void study(){
        System.out.println(name + "好好学习"); // name也属于对象，可以直接访问
    }


    public static void main(String[] args) {
        System.out.println(Student.getMax(10, 3)); // 10
        System.out.println(getMax(10, 32)); // 32, 同一个类中可以省略类名

        // study(); // 报错，一定要用对象来访问
        Student s = new Student();
        s.name = "猪八戒";
        s.study();

        // 虽然对象可以调用静态方法，但不推荐！
        System.out.println(s.getMax(13, 34));
    }


}
