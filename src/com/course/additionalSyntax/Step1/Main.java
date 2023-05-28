package com.course.additionalSyntax.Step1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            if (number < 10) {
                System.out.println("Less than 10");
            } else if (number == 10) {
                System.out.println("Equal to 10");
            } else {
                System.out.println("Larger than 10");
            }
        }
        catch (InputMismatchException e) {
            throw new MyException("Error! Not a number!");
        }
    }
}
