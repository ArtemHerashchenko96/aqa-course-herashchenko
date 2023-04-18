package com.course.syntax;

import java.util.Scanner;

public class Step6Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string sentence:");
        String sent = scanner.nextLine();
        if (sent.contains("java")) {
            char[] arr1 = sent.toCharArray();
            for (int i = 0; i < arr1.length / 2; i++) {
                char temp = arr1[arr1.length - 1 - i];
                arr1[arr1.length - 1 - i] = arr1[i];
                arr1[i] = temp;
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]);
            }
        } else {
            String[] arr2 = sent.split(" ");
            for (int i = 0; i < arr2.length; i++) {
                if (i % 2 != 0) {
                    arr2[i] = arr2[i].toUpperCase();
                    System.out.print(arr2[i] + " ");
                } else System.out.print(arr2[i] + " ");
            }
        }
    }
}