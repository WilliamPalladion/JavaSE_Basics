package com.william.interface_keyword.interface_extends;

// 接口与接口：多继承，一个接口可以同时继承多个接口
// 合并其他所有接口的功能，然后它的实现类只需要实现一个接口
public interface SportMan extends Law, People{
    void run();
    void competition();
}
