package com.aman.collection;

import java.util.*;

public class ListIteratorTest {

    public static void main(String[] args) {

        //ListIterator
        List<String> myList = Arrays.asList("String1", "String2", "String3", "String4");
        List<String> myListRev = Arrays.asList("String4", "String3", "String2", "String1");
        List<String> myListTemp = new ArrayList<>(Collections.emptyList());

        //creating and using list iterator
        ListIterator<String> listIterator = myList.listIterator(myList.size());
        while(listIterator.hasPrevious()) {
            myListTemp.add(listIterator.previous());
        }

        System.out.println(myListRev.toString().equals(myListTemp.toString()));
        System.out.println(myList.toString().equals(myListRev.toString()));
    }


}
