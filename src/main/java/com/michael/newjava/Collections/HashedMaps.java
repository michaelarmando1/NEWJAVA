package com.michael.newjava.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashedMaps {
    public static void main(String[] args) {
//        HashMap<String, ArrayList<int>> dictionary = new HashMap<String, ArrayList<int>>();
//        ArrayList<int> evenNoArrayList = new ArrayList<int>();
//        evenNoArrayList.add(4);
//
//        dictionary.put("Even Numbers", evenNoArrayList);

        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Fathom", "Come To Understand");
        dictionary.put("Eternity", "Forever");
        dictionary.put("Nympho", "A woman with abnormal sexual desires");

        System.out.println(dictionary.get("Nympho"));



    }


}
