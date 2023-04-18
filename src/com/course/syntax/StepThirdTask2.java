package com.course.syntax;

import java.util.Scanner;

public class StepThirdTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else System.out.println("The number is odd");
        } else System.out.println("Input is not a double");
    }
}
