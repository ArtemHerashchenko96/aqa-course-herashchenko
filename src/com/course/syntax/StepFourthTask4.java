package com.course.syntax;

import java.util.Scanner;

public class StepFourthTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        while (true) {
            int age = scanner.nextInt();
            if (age <= 0 || age > 140) {
                System.out.println("Error! Invalid age");
            } else {
                System.out.println("Your age is " + age);
                break;
            }
        }
    }
}

