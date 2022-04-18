package com.william.abstract_keyword.case_template;

public abstract class Student {
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("开头~");

        // 正文部分（每个子类都要写但又不一样，所以我们定义成抽象方法）
        System.out.println(writeMain());

        System.out.println("结尾~~");
    }

    public abstract String writeMain();
}
