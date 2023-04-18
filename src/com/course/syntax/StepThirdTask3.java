package com.course.syntax;

import java.util.Scanner;

public class StepThirdTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (scanner.hasNextFloat()) {
            float number = scanner.nextFloat();
            if ((number % 2 == 0 && number > 10) || number == 15) {
                System.out.println("It's true");
            } else System.out.println("It's false");
        } else System.out.println("Invalid input");
    }
}
