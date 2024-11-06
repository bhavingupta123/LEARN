package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        OwnHashMap<String, String> ownHashMap = new OwnHashMap<>();

        ownHashMap.put("A", "B");
        ownHashMap.put("C", "D");
        ownHashMap.put("E", "F");

        ownHashMap.put("A", "L");
        ownHashMap.put("K", "R");

        System.out.println(ownHashMap);
    }
}