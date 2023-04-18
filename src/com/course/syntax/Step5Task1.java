package com.course.syntax;

import java.util.Scanner;

public class Step5Task1 {
    public static void main(String[] args) {
        float average = 0f;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int numberOfelements = scanner1.nextInt();
        if (numberOfelements > 0) {
            float[] superArray = new float[numberOfelements];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < numberOfelements; i++) {
                superArray[i] = scanner2.nextFloat();
            }
            for (int i = 0; i < numberOfelements; i++) {
                average = average + superArray[i] / numberOfelements;
            }
            System.out.println("Average value for the array is: " + average);
        } else System.out.println("The number must be positive!");
    }
}

