package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LinkedList> lists = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(9);
        lists.add(linkedList);

        linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(8);
        lists.add(linkedList);

        linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(9);
        lists.add(linkedList);

        System.out.println("Original array of LinkedLists: " + lists);

        LinkedList<Integer> result = new LinkedList<>();

        for (LinkedList linkedList1 : lists) {

            for (Object i : linkedList1) {

                result.add((Integer) i);

            }

        }

        Collections.sort(result);
        System.out.println("Merged sorted LinkedList: " + result);

    }

}
