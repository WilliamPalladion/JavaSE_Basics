package com.william.loop;

public class BreakContinue {
    public static void main(String[] args) {
        // break: 跳出并结束当前所在循环的所有后续执行
        // continue: 跳出所在循环的当次执行，进行下一次循环

        // Case: 洗碗5天，但第三天就结束了
        for (int i = 0; i < 5; i++) {
            System.out.println("洗碗");
            if (i == 2) {
                break; // 注意 i == 2 就是第三天了
            }
        }

        // Case: 洗碗5天，但只有第三天不用洗
        for (int i = 1; i <=5 ; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("洗碗：" + i);
        }

        // Note: break只能用于结束所在循环，或者结束所在switch分支的执行; continue: 只能在循环中使用
        // break不能结束if
        // if (true){
        //     break;
        // }

        // 可以使用 OUT 来跳出多层循环
        // 在想要跳出循环的地方加入 OUT: 标签，同时写break OUT/continue OUT;
        int age = 20;
        OUT:
        while (true){
            for (int i = 0; i < 10; i++) {
                age += 1;
                if (age > 100) {
                    System.out.println("Old enough");
                    break OUT;
                }
            }
        }

    }
}
