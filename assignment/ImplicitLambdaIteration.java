package com.assignment;

import java.util.ArrayList;

public class ImplicitLambdaIteration {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }myList.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
