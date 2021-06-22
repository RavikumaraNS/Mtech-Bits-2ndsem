package com.ns.algos;

import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] array = new int[]{10,7,1,9,10,10};
        Arrays.sort(array);
        int len= array.length;
        if (array.length<2) System.out.println("Not found");

        int second=0;
        for (int i= len-2 ; i >=0 ; i--){
           if (array[i] != array[len-1]) { second =array[i]; break;}
        }

        System.out.println("Second largest: "+ second);

    }

}
