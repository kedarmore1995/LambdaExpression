package com.assignment;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ExplicitLambdaIteration {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        Consumer<Integer>myListaction = n -> {
            System.out.println(n);
        };
        myList.forEach(myListaction);
    }
}
