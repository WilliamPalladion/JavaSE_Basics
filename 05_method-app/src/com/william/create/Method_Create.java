package com.william.create;

public class Method_Create {
    public static void main(String[] args) {
        // 方法 (Method)：一种语法结构，可以把一段代码封装成一个功能，方便重复调用
        // 修饰符 返回值类型 方法名(形参列表){
        //     方法体代码
        //     return 返回值;
        // }
        // 假设有两个程序员都需要求和的功能，单独写会造成代码的冗余，所以我们再外定义一个求和的方法再调用
        int c1 = sum(10, 30);
        System.out.println(c1); // 40

        int c2 = sum(10, 50);
        System.out.println(c2); // 60

        System.out.println(sum(100, 200)); // 直接输出调用方法的结果

        // 无参数无返回值方法的调用
        print();
    }

    // 构造一个求和功能的方法
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    // 方法的其他定义写法:
    // 方法定义时，返回值类型、形参列表可以按照需求进行填写

    // e.g. 打印三行 Hello World
    // 无参数无返回值的方法
    public static void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World"); // ctrl + alt + t 快捷键
        }
    }
    // 如果方法不需要返回结果，返回值类型必须申明为 void (无返回值类型)，此时方法内部不可以使用 return 返回数据

   /* 方法的注意事项
    1) 方法的编写顺序无所谓

    2) 方法与方法之间是平级关系，不能嵌套定义 (i.e. 不可以把一个方法放在另一个方法的内部定义)

    3) 方法的返回值类型为 void 则方法内部不能再用return返回数据；如果返回值类型有具体类型，则内部必须return具体类型

    4) return 下方不写代码，因为永远执行不到 (Unreachable)

    5) 方法不调用就不执行，调用一定要严格匹配参数

    6) 有返回值的方法调用可以定义变量接受，或者直接输出调用，甚至直接调用；无返回值的方法只能直接调用！！
    */
}
