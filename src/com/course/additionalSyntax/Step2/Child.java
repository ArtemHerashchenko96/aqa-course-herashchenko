package com.course.additionalSyntax.Step2;

public class Child extends Parent{
    public Child(){
        System.out.println("Message from Child constructor");
    }
    static {
        System.out.println("Message from Child static initialization block");
    }
    {
        System.out.println("Message from Child initialization block");
    }
}
