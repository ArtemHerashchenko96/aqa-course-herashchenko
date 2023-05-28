package com.course.additionalSyntax.Step4.Task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, User> myHashMap = new HashMap<>();
        myHashMap.put(1, new User(1, "User1"));
        myHashMap.put(2, new User(2, "User2"));
        myHashMap.put(3, new User(3, "User3"));
        myHashMap.put(4, new User(4, "User4"));
        myHashMap.put(5, new User(5, "User5"));
        myHashMap.put(6, new User(6, "User6"));
        for (User user: myHashMap.values()){
            if (user.getId()%2 == 0) {
                System.out.println(user);
            }
        }
    }
}
