package com.course.additionalSyntax.Step4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, String> inputMap = new HashMap<>();
        inputMap.put("aaa", "String1");
        inputMap.put("ggg", "String2");
        inputMap.put("ccc", "String3");
        inputMap.put("cccc", "String4");
        inputMap.put("bbb", "String5");
        inputMap.put("ddd", "String6");
        myMethod(inputMap);
    }

    public static TreeMap<String, String> myMethod(HashMap<String, String> inputMap) {
        TreeMap<String, String> sortedMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == 3) {
                sortedMap.put(key, value);
            }
        }
        System.out.println(sortedMap);
        return sortedMap;
    }
}