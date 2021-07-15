package com.ns.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindEqualParts {

    public static void main(String[] args) {

        FindEqual equal= new FindEqual();
        System.out.println(equal.count("abcabcabcabcabc"));
    }

}

class  FindEqual{

    public int count(String str){
        char[] chars = str.toCharArray();
        int parts=0;

        HashMap<String, Integer> hs =  new HashMap<>();
        for (int i = 0; i < chars.length/2; i++) {
            String s = String.valueOf(chars, 0, i+1);
            int j=0;
            while (j < chars.length && chars.length%(i+1) ==0) {
                if (!s.contentEquals(String.valueOf(chars, j, i+1))) {
                    if(hs.containsKey(s)) hs.remove(s);
                    break;
                }
                if (hs.containsKey(s)) {
                    hs.put(s, hs.get(s) + 1);
                }else {
                    hs.put(s, 1);
                }
                j=j+i+1;
            }
        }
        
        Set<Map.Entry<String,Integer>> set = hs.entrySet();

        for (Map.Entry<String,Integer> set1:set) {

           if (chars.length % set1.getValue() == 0){
               parts = set1.getValue();
               System.out.println("String:"+set1.getKey());
           }
        }

        return parts;
    }

}