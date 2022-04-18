package com.william.inheritance;

// Student 类： 子类
public class Student extends People {
    // 子类只定义独有的属性和行为
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void writeInfo(){
        System.out.println(getName() + "学习xx知识");
        // 注意不能直接写name因为它在父类中私有
    }
}
