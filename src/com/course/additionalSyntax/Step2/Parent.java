package com.course.additionalSyntax.Step2;

public class Parent {
    public Parent(){
        System.out.println("Message from Parent constructor");
    }
    static {
        System.out.println("Message from Parent static initialization block");
    }
    {
        System.out.println("Message from Parent initialization block");
    }
}
