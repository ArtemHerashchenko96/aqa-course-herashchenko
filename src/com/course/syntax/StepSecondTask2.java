package com.course.syntax;

public class StepSecondTask2 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("The start value of the variable 'a' = " + a);
        a = a++;
        System.out.println("The value of the variable 'a' after postfix increment = " + a);
        a = ++a;
        System.out.println("The value of the variable 'a' after prefix increment = " + a);
        a = a--;
        System.out.println("The value of the variable 'a' after postfix decrement = " + a);
        a = --a;
        System.out.println("The value of the variable 'a' after prefix decrement = " + a);
    }
}
