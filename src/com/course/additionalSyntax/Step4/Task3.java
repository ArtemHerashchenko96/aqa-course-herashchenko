package com.course.additionalSyntax.Step4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Olya");
        mySet.add("Natasha");
        mySet.add("Polina");
        mySet.add("Vlad");
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Bohdan");
        myList.add("Oleksandr");
        myList.add("Vlad");
        myList.add("Natasha");
        ArrayList<String> resultCollection = new ArrayList<String>();
        resultCollection.addAll(mySet);
        resultCollection.addAll(myList);
        for (String i : resultCollection) {
            System.out.println(i);
        }
    }
}
