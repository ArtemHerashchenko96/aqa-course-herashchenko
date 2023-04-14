package com.course.syntax;

import java.util.Scanner;


public class Step6Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string sentence in PascalCase:");
        String sent = scanner.nextLine();
        String result = "";
        for (int i = 0; i < sent.length(); i++) {
            char c = sent.charAt(i);
            if (Character.isUpperCase(c)) {
                result += " ";
            }
            result += c;
        }
        System.out.println(result.trim());
    }
}