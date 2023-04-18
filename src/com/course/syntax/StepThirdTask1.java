package com.course.syntax;

import java.util.Scanner;

public class StepThirdTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 10) {
                System.out.println("Less than 10");
            } else if (number == 10) {
                System.out.println("Equal to 10");
            } else if (number > 10) {
                System.out.println("Larger than 10");
            }
        } else System.out.println("Input is not an integer.");
    }
}
