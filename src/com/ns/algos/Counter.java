package com.ns.algos;

public class Counter {

    public static void main(String[] args){
        int [] counterval = {Integer.MAX_VALUE-1,Integer.MAX_VALUE-1} ;
        int i = 10;
        while (i != 0){
            counterval= count(counterval);
            for (int val:counterval) {
                System.out.print(String.format("%08X", val));
            }
            System.out.println();
            i --;
        }
    }

    private static  int[] count(int[] array){
        int n = array.length;

        for (int i = n-1; i >= 0; i--) {

            if (++array[i] != Integer.MIN_VALUE) {
                return array;
            }
            array[i] = 0;
        }
        array = new int[n+1];
        array[0]=1;
        return array;
    }
}
