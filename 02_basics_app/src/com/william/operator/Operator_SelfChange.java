package com.william.operator;

public class Operator_SelfChange {
    public static void main(String[] args) {
        // 2. 自增自减运算符：++, --
        int c = 10;
        c++; // c = c + 1
        ++c;
        System.out.println(c);

        int d = 10;
        d--;
        --d;
        System.out.println(d);

        // ++/-- 若不是单独使用（如在表达式中，或同时有其他操作），放在变量前后有明显区别
        // 放在变量前：先对变量+1/-1, 再进行计算
        int e = 10;
        int rs = ++e;
        System.out.println(e); // 11
        System.out.println(rs); // 11

        // 放在变量后：先进行运算, 再对变量+1/-1
        int f = 10;
        int rt = f++ + 5;
        System.out.println(f); // 11
        System.out.println(rt); // 15

        System.out.println("-------------------------------------");
        // Case:
        int m = 3;
        int n = 5;
        int rs2 = m++ + ++m - --n + n-- - m-- + ++n + 2;

        // 技巧：对每一个变量列一行，同步更新值
        // m   3 4 5 4
        // n   5 4 3 4
        // rs2 3 + 5 - 4 + 4 - 5 + 4 + 2
        System.out.println(rs2); // 9
        System.out.println(m); // 4
        System.out.println(n); // 4
    }
}
