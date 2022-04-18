package com.william.arraylist;

import java.util.ArrayList;

public class ArrayList_Case1 {
    public static void main(String[] args) {
        // Case 1: 遍历删除元素值
        // 某班考试成绩为：98, 77, 66, 89, 79, 50, 100，现在要将成绩低于80分以下的数据去掉
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores); // [98, 77, 66, 89, 79, 50, 100]

        /*
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores); // [98, 66, 89, 50, 100]
        // 结果明显错误了，原因是ArrayList在删除某个位置的元素时，后一个元素会自动向前补位，但会导致计数的 i 跳位，造成漏网之鱼
        */

        // Method 1: 删除完成后，让计数的 i 退一步
        /*
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80){
                scores.remove(i);
                i--; // i往后退，避免跳位
            }
        }
        System.out.println(scores); // [98, 89, 100]
        */
        
        // Method 2: 倒着遍历，右侧已经经过判断的数据往前提，也可以避免 i 跳位问题
        for (int i = scores.size() - 1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
