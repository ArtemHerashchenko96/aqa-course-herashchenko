package com.course.syntax;

import java.util.Scanner;

public class StepFourthTask2 {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Can't calculate factorial");
            } else {
                for (int i = 1; i <= number; ++i) {
                    factorial = factorial * i;
                }
                System.out.println(factorial);
            }
        } else System.out.println("Invalid input");
    }
}

