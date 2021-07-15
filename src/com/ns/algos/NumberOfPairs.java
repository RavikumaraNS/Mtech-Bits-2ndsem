package com.ns.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NumberOfPairs {

    public static void main(String[] args) {

           List<Integer> list = Arrays.asList(1,2,2,2,1,4,4,4,9,5) ;
        System.out.println("output:"+socksMerchant(list.size(), list));

    }

    static int socksMerchant(int n, List<Integer> ar){

        String s = new String();
        
        if ((n <= 0 ) || (ar == null)) return 0;

        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(ar.get(i)))  hs.put(ar.get(i),hs.get(ar.get(i))+1) ;
              else
                  hs.put(ar.get(i), 1);
        }
         int count =0;
        for (Integer a: hs.values()) {
               count+=a/2;
        }

        return count;
    }
}
