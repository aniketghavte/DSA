package com.Aniketstart.Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayList_concepts {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(5);
        list.add(59);
        list.add(53);
        list.add(8);
        System.out.println(list);

        System.out.println(list.get(1));
        list.add(1,9);
        System.out.println(list);
        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
//        list.get();


    }
}
