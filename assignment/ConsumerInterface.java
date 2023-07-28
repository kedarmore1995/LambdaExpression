package com.assignment;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterface implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        ConsumerInterface CIobj = new ConsumerInterface();
        myList.forEach(CIobj);
    }
}