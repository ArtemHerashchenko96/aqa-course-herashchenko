package com.course.syntax;

import java.util.Scanner;

public class Step6Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string sentence:");
        String sent = scanner.nextLine();
        sent = sent.replace(" ", "").toUpperCase();
        char[] arr = sent.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


