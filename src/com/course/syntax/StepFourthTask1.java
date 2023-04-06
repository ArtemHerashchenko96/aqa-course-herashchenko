package com.course.syntax;

import java.util.Scanner;

public class StepFourthTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Error! The number is negative");
            }
            for (int i = 0; i <= number; ++i) {
                if (i % 3 == 0) {
                    System.out.println("The number multiple to 3");
                } else if (i % 2 == 0) {
                    System.out.println(i + " - The number is even");
                } else System.out.println(i);
            }
        } else System.out.println("Invalid input");
    }
}
