package com.william.inner_class.inner_local;

public class LocalClassDemo {
    // 3）局部内部类
    // 局部内部类放在方法、代码块、构造器等执行体中；
    // 局部内部类的类文件名为：外部类$N内部类.class

    static {
        class Dog {
        }

        abstract class Animal {
        }

        interface SportManInter {
        }
    }


    public static void main(String[] args) {

        class Cat {
            private String name;
            public static int onlineNumber = 100; // JDK 15 开始可以定义静态成员

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("mimi");
    }
}
