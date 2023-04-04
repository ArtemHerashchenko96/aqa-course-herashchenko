package com.course.syntax;

public class StepSecondTask2 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("The start value of the variable a = "+a);
        int b = a++;
        System.out.println("The variable b = "+b+". The value of the variable a after postfix increment = "+a);
        int c = ++a;
        System.out.println("The variable c = "+c+". The value of the variable a after prefix increment = "+a);
        int d = a--;
        System.out.println("The variable d = "+d+". The value of the variable a after postfix decrement = "+a);
        int e = --a;
        System.out.println("The variable e = "+e+". The value of the variable a after prefix decrement = "+a);
    }
}
