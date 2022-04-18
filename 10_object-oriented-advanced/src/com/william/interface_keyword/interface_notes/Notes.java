package com.william.interface_keyword.interface_notes;

public class Notes {
    public static void main(String[] args) {
        // 接口的注意事项
        // 1）接口不能创建对象 (接口是更加彻底的抽象)；
        // 2）一个类实现多个接口，多个接口中有同样的静态方法不冲突；
        // 3）一个类继承了父类，又实现了接口，父类中和接口中有同名方法，默认用父类的；
        Cat c = new Cat();
        c.eat(); // 父类中的eat()方法

        // 4）一个类实现了多个接口，多个接口中有同名的默认方法，不冲突，这个类重写该方法即可；
        // 5）一个接口继承多个接口是可以的，但如果多个接口中存在规范冲突则不能多继承
    }
}

// 2）一个类实现多个接口，多个接口中有同样的静态方法不冲突；
interface A{
    static void test(){
        System.out.println("A");
    }
}

interface B{
    static void test(){
        System.out.println("B");
    }
}

class C implements A, B{
    public static void main(String[] args) {
        // C.test();
        // 这里担心的就是这种情况，但注意接口A,B 是不允许实现类C去调用接口的静态方法的，只能自己调用自己的静态方法，所以不会冲突
        A.test();
        B.test();
    }
}

// 3）一个类继承了父类，又实现了接口，父类中和接口中有同名方法，默认用父类的；
interface Food{
    default void eat(){
        System.out.println("接口中的eat()方法");
    }
}

class Animal{
    public void eat(){
        System.out.println("父类中的eat()方法");
    }
}

// 注意一定是 extends ... implements ... (继承一定要在前面)
class Cat extends Animal implements Food {

}


// 4）一个类实现了多个接口，多个接口中有同名的默认方法，不冲突，这个类重写该方法即可；
interface AA{
    default void go(){
        System.out.println("AA");
    }
}

interface BB{
    default void go(){
        System.out.println("BB");
    }
}

class CC implements AA, BB{
    @Override
    public void go() {
        // 可以自己另起炉灶重写方法，可以调用被实现接口的内容
        AA.super.go();
        BB.super.go();
    }
}



// 5）一个接口继承多个接口是可以的，但如果多个接口中存在规范冲突则不能多继承
interface AAA{
    int run();
}

interface BBB{
    void run();
}

// 规则冲突，不能多继承
// interface CCC extends AAA, BBB{}

