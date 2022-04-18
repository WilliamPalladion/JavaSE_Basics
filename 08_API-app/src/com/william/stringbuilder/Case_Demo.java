package com.william.stringbuilder;

/** Case: 打印整形数组内容
 * 设计一个方法用于输出任意整形数组的内容，格式如下：
 * ”该数组内容为：[11, 22, 33, 44, 55]“
 * */
public class Case_Demo {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(toString(arr1));

        int[] arr2 = {10, 20, 30};
        System.out.println(toString(arr2));

        int[] arr3 = {};
        System.out.println(toString(arr3));
    }

    public static String toString(int[] arr){
        if (arr != null){
            StringBuilder sb = new StringBuilder("该数组的内容为：[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            return sb.toString();
        } else {
            return null;
        }
    }
}
