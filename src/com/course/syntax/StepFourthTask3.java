package com.course.syntax;

import java.util.Scanner;

public class StepFourthTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0 || Math.abs(number) == 1) {
                System.out.println("There is no such divider");
            } else {
                for (int i = 2; i <= Math.abs(number); ++i) {
                    if (number % i == 0) {
                        System.out.println("The largest integer divisor is " + Math.abs(number / i));
                        break;
                    }
                }
            }
        } else System.out.println("Invalid input");
    }
}
