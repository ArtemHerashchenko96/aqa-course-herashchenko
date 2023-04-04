package com.course.syntax;
import java.util.Scanner;

public class StepSecond {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the first side: ");
            float a = scanner.nextFloat();
            System.out.print("Enter the length of the second side: ");
            float b = scanner.nextFloat();
            System.out.print("Enter the length of the third side: ");
            float c = scanner.nextFloat();
            float p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if (a<=0 || b<=0 || c<=0) {
                System.out.println("Invalid input. The length of the sides must be positive numbers.");
            } else
            if (a+b>c && a+c>b && b+c>a) {
                System.out.println("The area of your triangle is "+s);
            }
            else System.out.println("Unable to build a triangle!");
        }
    }
