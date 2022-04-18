package com.william.inheritance;

public class Teacher extends People {
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void publishQuestions(){
        System.out.println(getName() + "发布问题");
    }
}
