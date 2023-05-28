package com.course.additionalSyntax.Step4;

import java.util.TreeSet;

public class Taks1 {
    public static void main(String[] args) {
        TreeSet<String>myCollection = new TreeSet<>();
        myCollection.add("a");
        myCollection.add("c");
        myCollection.add("e");
        myCollection.add("b");
        myCollection.add("d");
        for (String i: myCollection) {
            System.out.println(i);
        }
    }
}
