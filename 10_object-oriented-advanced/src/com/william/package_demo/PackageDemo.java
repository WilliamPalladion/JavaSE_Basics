package com.william.package_demo;

// 导包
import com.william.package_demo.it.Student;

import java.util.Scanner;

public class PackageDemo {
    public static void main(String[] args) {
        //  包是用来分门别类地管理各种不同类的，类似文件夹；建包有利于程序的管理和维护
        //  建包的语法： package Name; (必须在第一行)
        //  导包：import packName.className
        //  相同包下的类可以直接访问，不同包下的类必须导包

        // 相同包下的类可以直接访问
        System.out.println(User.onlineNumber); // 120

        // 不同包下的类必须导包 (alt + enter)
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        // 如果类中要使用不同包下的相同的类名，默认只能导入一个类的包，另一个类要用全名访问
        // com.william.package_demo.it.Student
        // com.william.package_demo.it2.Student
        com.william.package_demo.it2.Student s2 = new com.william.package_demo.it2.Student();

    }
}
