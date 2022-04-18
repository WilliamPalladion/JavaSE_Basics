package com.william.interface_keyword.sports_case;

// 接口的使用：接口是用来被类 实现 (implements) 的，实现接口的类称为 实现类 (可以理解为子类)；
// 接口可以被类单实现，也可以被类多实现
/*
修饰符 class 实现类 implements 接口1, 接口2, 接口3, ... {
}
*/

public interface SportMan {
    void run();
    void competition();
}
