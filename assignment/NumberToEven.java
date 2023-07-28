package com.assignment;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NumberToEven {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        Predicate<Integer>isEvenFunction=n-> n%2 ==0;
        myList.forEach(n-> {
            if(isEvenFunction.test(n)){
                System.out.println(n);
            }
        });
    }
}
