package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIteration {
    public void iteration1(){
        ArrayList<Integer> myList= new ArrayList<>();
        for (int i=0; i<10; i++) {
            myList.add(i);
        }
    Iterator<Integer>it= myList.iterator();
        while (it.hasNext()){
            int itr=it.next();
            System.out.println(itr);
        }
    }

    public static void main(String[] args) {
        ListIteration lstObj = new ListIteration();
        lstObj.iteration1();
    }
}