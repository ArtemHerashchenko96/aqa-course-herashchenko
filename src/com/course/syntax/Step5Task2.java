package com.course.syntax;

public class Step5Task2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50, 60};
        int[] array2 = {100, 200, 300, 400};
        int[] arrayMerge = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayMerge[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayMerge[array1.length + i] = array2[i];
        }
        for (int i = 0; i < arrayMerge.length; i++) {
            System.out.print(arrayMerge[i] + " ");
        }
    }
}
