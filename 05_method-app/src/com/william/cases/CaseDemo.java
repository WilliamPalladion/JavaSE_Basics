package com.william.cases;

public class CaseDemo {
    public static void main(String[] args) {
        // Case 1: 打印整形数组的内容，格式为 “该数组的内容为：[11, 22, 33, 44, 55]”
        int[] ages = {11, 22, 33, 44, 55};
        printArray(ages);

        int[] numbers = null;
        printArray(numbers); // 报错，因为这个时候的数组长度会报错 NullPointerException，所以我们需要加入一个判断语句

        // Case 2: 查询指定元素的索引并返回，若不存在则返回 -1
        int[] arr = {11, 22, 33, 66, 87, 19};
        int index = searchIndex(arr, 87);
        System.out.println("您查询的数据的索引是：" + index);

        // Case 3: 比较2个整形数组是否一样：类型、元素个数、元素顺序，返回true/false
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(compare(arr1, arr2));

    }

    // Case 1
    public static void printArray(int[] arr){
        System.out.print("[");

        // 防止null或者空数组被遍历
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
        /*    if (i == arr.length - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        */
                // 还有更简单的写法
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            }
        }

        System.out.println("]");
    }

    // Case 2
    public static int searchIndex(int[] arr, int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    // Case 3
    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
