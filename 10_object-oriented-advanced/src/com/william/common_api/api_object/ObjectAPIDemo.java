package com.william.common_api.api_object;

/** 1) Object
 * 一个类要么默认继承了Object类，要么间接继承了Object，Object是祖宗类；因此子类都可以直接调用Object类的方法
 * 常用方法：
 public String toString(): 默认返回当前对象在堆内存中的地址信息 (类的权限名@内存地址)
 public Boolean equals(Object o): 默认比较当前对象与另一对象的地址是否相同
 */
public class ObjectAPIDemo {
    public static void main(String[] args) {
        // public String toString(): 默认返回当前对象在堆内存中的地址信息 (类的权限名@内存地址)
        Student s = new Student("william", '男', 19);
        System.out.println(s.toString());
        System.out.println(s);
        // com.william.common_api.api_object.Student@4eec7777

        // 开发中直接输出对象的地址其实毫无意义，我们更希望看到对象的内容数据
        // 父类toString()方法存在的意义就是为了被子类重写，以便返回对象的内容信息
        System.out.println(s);
        // Student {name = william, sex = 男, age = 19}

        // public Boolean equals(Object o): 默认比较当前对象与另一对象的地址是否相同
        Student s1 = new Student("william", '男', 19);
        Student s2 = new Student("william", '男', 19);
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1 == s2); // false

        // 如果只是比较两个对象的地址，完全可以用 == 来替代
        // 父类equals()方法存在的意义就是为了被子类重写，以便子类自己来定制比较规则
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
