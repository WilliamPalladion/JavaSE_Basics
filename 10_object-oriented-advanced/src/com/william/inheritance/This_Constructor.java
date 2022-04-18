package com.william.inheritance;

public class This_Constructor {
    public static void main(String[] args) {
        // this(...): 访问本类的构造器
        Student1 s1 = new Student1("John");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName()); // St.Johns School
    }
}

class Student1 {
    private String name;
    private String schoolName;

    public Student1(){
    }

    // Case: 如果学生不填写学校，则默认使用 "St.Johns School"
    // this(...): 访问本类的构造器

    public Student1(String name) {
        // 直接调用下方的兄弟有参构造器
        this(name, "St.Johns School");
        // 为什么this(...)也要在第一行，因为如果不先立即通过兄弟构造初始化父类，就不能初始化子类的构造器
    }

    public Student1(String name, String schoolName) {
        super(); // 必须先初始化父类，再初始化自己
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
