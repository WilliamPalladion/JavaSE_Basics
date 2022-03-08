package com.william.string;

public class StringAPIOther {
    public static void main(String[] args) {
        // 1. public int length(): 返回字符串长度
        String name = "william";
        System.out.println(name.length()); // 7

        // 2. public char charAt(int index): 获取index索引位置的字符
        char c = name.charAt(1);
        System.out.println(c); // i

        // 遍历
        System.out.println("-----------遍历字符串中的每个字符--------------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }

        // 3. public char[] toCharArray(): 将当前字符串转换成字符数组返回
        char[] chars = name.toCharArray();
        // 又有一种遍历的方法
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);
        }

        // 4. public String substring(int beginIndex, int endIndex): 截取字符串(包前不包后)，返回一个新字符串
        String name2 = "Java牛逼";
        String rs = name2.substring(0, 4); // Java
        System.out.println(rs);

        // 5. public String substring(int beginIndex): 从索引处一直截取到末尾
        String rs2 = name2.substring(4);
        System.out.println(rs2); // 牛逼

        // 6. public String replace(CharSequence target, CharSequence replacement): 将字符串中的旧值替换成新值，得到新字符串
        String name3 = "金三胖是最厉害的80后，金三胖强的不行";
        String rs3 = name3.replace("金三胖", "***");
        System.out.println(rs3); // "***是最厉害的80后，***强的不行"

        // 7. public boolean contains(CharSequence s): 是否包含具体字符串(精确比对)
        System.out.println(name3.contains("金三胖")); // true

        // 8. public boolean startsWiths(String prefix)：判断给定字符串是否以某个具体的字符串开始
        System.out.println(name3.startsWith("金三胖")); // true
        System.out.println(name3.startsWith("金三胖是最厉害的")); // true
        System.out.println(name3.startsWith("金三胖是最厉害的2")); // false

        // 9. public String[] split(String regex): 根据传入的规则切割字符串，得到字符串数组返回
        String name4 = "王宝强, 贾乃亮, 谢霆锋";
        String[] names = name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
