package com.assignment;

import java.util.ArrayList;
import java.util.function.Function;

public class NumberToDouble {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        Function<Integer,Double> doubleFunction= Integer::doubleValue;
        myList.forEach(n ->{
            System.out.println(doubleFunction.apply(n));
        });
    }
}
