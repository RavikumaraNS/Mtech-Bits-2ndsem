package com.ns.algos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringFrequency {

    public static void  main(String[] args){
        String str =  "aabbccc-+;---";

        HashMap<Character,Integer> hashMap = new HashMap<>();

        char[] chars = str.toCharArray();

        for (int i=0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
            }else {
                hashMap.put(chars[i],1);
            }
        }

        Set<Map.Entry<Character,Integer>> set = hashMap.entrySet();

        HashSet<Integer> hs = new HashSet<Integer>();
        for (Map.Entry<Character,Integer> entry : set
             ) {
                hs.add(entry.getValue());
        }

        System.out.println("Total number of times required:"+ hs.size());

    }

}
