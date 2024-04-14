package com.michael.newjava.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LearningArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(0, "Yam");
        list.add(1, "Egg");
        list.set(0, "dodo");

        System.out.println(list);


    }
}