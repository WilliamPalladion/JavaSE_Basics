package com.william.abstract_keyword.case_template;

public class StudentMiddle extends Student{
    // 就近原则，还是会调用子类的writeMain方法
    @Override
    public String writeMain() {
        return "中学生的正文";
    }
}
