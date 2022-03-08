package com.william.cases;

// Case 4: 数组元素的复制

public class CaseDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44};
        // int[] arr2 = arr1; // 这并没有完成数组的复制，只是获得了数组的地址

        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);

        // 调用方法输出两个数组
        printArray(arr1);
        printArray(arr2);
    }

    public static void copy(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i]: arr[i] + ", ");
        }
        System.out.println("]");
    }
}
