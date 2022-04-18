package com.william.abstract_keyword;

// 抽象类/方法: abstract修饰的类/成员方法
// 抽象类可以理解为不完整的设计图，一般作为父类让子类继承；
// 当父类知道子类一定要完成某些行为，但每个子类该行为的实现又不同，于是父类就把该行为定义成抽象方法的形式交给子类去具体实现；此时这个类就可以声明为抽象类
/*
修饰符 abstract class Name{
    修饰符 abstract 返回值类型 方法名称(形参列表);
}
*/

// e.g. 我们想把Animal定义为父类，让其他具体的动物类来继承，
// 比如大家都会跑，都有run()方法，但每个动物的跑法可能都不一样，所以我们不把方法完全写出来，而是抽象化，交给具体的子类去实现
// 因此我们可以把抽象类/方法理解为一种 “填空”，只定了大体的方向，但具体细节需要子类继续填充

public abstract class Animal {
    private String name;

    public abstract void run(); // 有了抽象方法，就要把类声明成抽象类

    public void test(){
        System.out.println("抽象类也可以声明非抽象方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
