package com.william.cases;

import java.util.Random;

/* Case 3: 开发验证码
   定义方法随机产生一个5位的验证码，每位可能是数字、大写/小写字母
*/
public class CaseDemo3 {
    public static void main(String[] args) {
        // 调用验证码方法
        String code = createCode(5);
        System.out.println("随机验证码：" + code);
    }

    // 验证码是字符串，返回类型应该是String，参数是位数
    public static String createCode(int n){
        String code = "";
        // 循环来依次生成随机字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 生成一个随机字符：英文大写，小写，数字，
            // 我们可以用一个随机数决定生成哪一类 (0, 1, 2)
            int type = r.nextInt(3);
            switch(type) {
                case 0:
                    // 大写字符 ("A": 65 ~ "Z": 65+25) -> (0, 25) + 65
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    // 大写字符 ("a": 97 ~ "z": 97+25) -> (0, 25) + 97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    code += r.nextInt(10); // (0, 9)
                    break;
            }
        }
        return code;
    }
}
