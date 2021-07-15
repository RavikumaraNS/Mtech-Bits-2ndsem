package com.ns.algos;

import java.util.ArrayList;
import java.util.List;

//Get the largest number by removing a digit. Assume that given digit is present at least once
//For example:
// N- 15985  digit - 5 outout- 1985


public class GetLargestByRemovingDigit {

    public static void main(String[] args) {

        System.out.println("LargestNumber:" + getLargest(-5000005,5));

    }

    public static int getLargest (int N, int digit){
        String number = Integer.toString(N);
        int size  = number.length();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(Character.compare(number.charAt(i),Character.forDigit(digit, 10)) == 0){
                if (i ==0) {
                    results.add(Integer.valueOf(number.substring(1)));
                }else if(i == size-1){
                    results.add(Integer.valueOf(number.substring(0, size-1)));
                }else{
                    results.add(Integer.valueOf(number.substring(0, i)+number.substring(i+1, size)));
                }
            }
        }
        results.sort(Integer::compareTo);
        return  results.get(results.size()-1);
    }

}
