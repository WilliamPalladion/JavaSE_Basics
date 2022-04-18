package com.william.abstract_keyword.case_template;

public class CaseDemo {
    public static void main(String[] args) {
        // 模板方法模式：
        // 场景：当系统中出现一个功能被多处在开发，而该功能中大部分代码一样，只有其中部分可能不同时；

        // 实现步骤：
        // 1）将功能定义成一个所谓的模板方法，放在抽象类中，模板方法中只定义通用且能确定的代码；
        // 2）模板方法中不能决定的功能定义成抽象方法让具体子类去实现
        // 3）模板方法建议用final来修饰，防止被重写失去模板的意义

        StudentMiddle sm = new StudentMiddle();
        sm.write();

        StudentChild sc = new StudentChild();
        sc.write();
    }
}
