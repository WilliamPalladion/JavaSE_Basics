package com.william.inheritance;

public class Constructor_Param {
    public static void main(String[] args) {
        // 继承后子类构造器访问父类有参构造器:
        // super 调用父类有参数构造器：直接初始化继承自父类的数据
        Teacher1 t = new Teacher1("william", 12);

        System.out.println(t.getName());
        System.out.println(t.getAge());

    }
}

class People1 {
    private String name;
    private int age;

    public People1(){
    }

    public People1(String name, int age) {
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


class Teacher1  extends People1 {

    // 父类如果没有无参构造器，这里就会报错，因为子类默认调用父类无参构造器
    // 可以在子类构造器中 super(...) 手动调用父类的有参构造器来规避错误
    public Teacher1(){
    }

    public Teacher1(String name, int age){
        // super 调用父类有参数构造器
        super(name, age);
    }

}