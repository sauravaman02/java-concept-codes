package com.aman.collection;

import java.util.*;

public class ListInsertComparison {

    public static long insertMid(List<String> list, List<String> more) {

        int target = list.size() / 2;
        long start = System.nanoTime();

        for (String s: more) {
            list.add(target++, s);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public static long insertIter(List<String> list, List<String> more) {

        int target = list.size() / 2;
        long start = System.nanoTime();

        ListIterator<String> listIterator = list.listIterator(target);

        for (String s: more) {
            listIterator.add(s);
        }

        long end = System.nanoTime();

        return end - start;

    }

    public static void main(String[] args) {

        final int COUNT = 250_000;
        String [] items = new String [COUNT];

        for (int i=0; i<COUNT; i++) {
            items[i] = "" + i;
        }

        List<String> starting = Arrays.asList(items);
        List<String> ll = new LinkedList<>(starting);

        System.out.printf("The time taken to insert 250k records using list.add method in middle of a linked list is:"
                + " %3.5f seconds \n", insertMid(ll, starting) / 1_000_000_000.0);

        System.out.printf("The time taken to insert 250k records using listIterator add method in middle of a linked list is:"
                + " %3.5f seconds \n", insertIter(ll, starting) / 1_000_000_000.0);

        //When ll is an Array list the time taken is reversed.


    }
}
