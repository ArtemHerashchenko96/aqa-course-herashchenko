package com.course.syntax;

import java.util.Scanner;

public class Step6Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string sentence:");
        String sent = scanner.nextLine();
        System.out.println("Enter the symbol, number of which must be count:");
        char symb = scanner.next().charAt(0);
        char[] arr = sent.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symb) {
                ++count;
            }
        }
        System.out.println(count);
    }
}