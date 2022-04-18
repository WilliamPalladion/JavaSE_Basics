package com.william.code_block;

public class Instance_CodeBlock {
    // 2）构造(/实例)代码块：{}
    // 每次创建对象，调用构造器时 (构造对象)，都会执行该代码块中的代码，且在构造器执行前执行
    // 使用场景：初始化实例资源 (使用场景较少)
    private String name;

    // 实例代码块每次构造对象才会被调用，但会优先构造器执行
    {
        System.out.println("=========实例代码块被触发==========");
    }

    // 无参构造器
    public Instance_CodeBlock(){
        System.out.println("=========无参构造器被触发===========");
        name = "张三"; // // 实例资源被初始化，但这样可能会导致问题
    }



    public static void main(String[] args) {
        Instance_CodeBlock s1 = new Instance_CodeBlock();
        // =========实例代码块被触发========== (优先执行！！)
        // =========无参构造器被触发===========

        Instance_CodeBlock s2 = new Instance_CodeBlock();
        // 实例资源被初始化，但这样可能会导致问题 (如下，因为在构造器前被调用，导致所有姓名都是张三)
        System.out.println(s1.name); // 张三
        System.out.println(s2.name); // 张三
    }
}
