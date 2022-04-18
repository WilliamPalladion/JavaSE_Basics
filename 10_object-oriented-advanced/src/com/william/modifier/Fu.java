package com.william.modifier;

public class Fu {
    // private: 同一个类中
    private void privateMethod(){
        System.out.println("---private---");
    }

    // 缺省: 同一个类中，同一个包中其他类 (包访问权限)
    void method(){
        System.out.println("---缺省---");
    }

    // protected: 同一个类中，同一个包中其他类，不同包下的子类
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

    // public: 同一个类中，同一个包中其他类，不同包下的子类，不同包下的无关类
    public void publicMethod(){
        System.out.println("---public---");
    }


    public static void main(String[] args) {
        Fu f = new Fu();

        // 本类中都可以访问
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
