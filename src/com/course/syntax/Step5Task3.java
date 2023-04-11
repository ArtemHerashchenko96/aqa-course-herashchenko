package com.course.syntax;

public class Step5Task3 {
    public static void main(String[] args) {
        int[] array = {-10, 20, -80, 2222, 100};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
