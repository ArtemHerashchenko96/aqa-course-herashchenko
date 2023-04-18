package com.course.syntax;

public class Step5Task4 {
    public static void main(String[] args) {
        int[] array1 = {8, -10, -90, 100, 9, 30, -100, 0};
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j + 1];
                    array1[j + 1] = array1[j];
                    array1[j] = temp;
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
