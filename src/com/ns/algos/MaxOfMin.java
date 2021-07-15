package com.ns.algos;

import java.util.*;

public class MaxOfMin {
    public static void main(String[] args) {
        int[] a= {4,1,3,2};

        int window=2;

        System.out.println("MaxOfMin:"+ getMax(a,2));
        System.out.println("MaxLinear:"+ getMaxWithLinear(a, 2));

    }

    //Approach-sort each window and get the list and choose second highest element in the list
    private static int getMax(int[] a, int window){
        int min,max=0;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < a.length-window+1; i++) {
            min = a[i];
            for (int j = 1; j < window; j++) {
                  if(a[j+i] < min)  min = a[j+i];
            }
            if(!list.contains(min)) list.add(min);
        }

        Collections.sort(list);
        max = list.get(0).intValue();
        for (int i = 1; i < list.size(); i++) {
               if(!list.get(i).equals(list.get(i-1)))  {max= list.get(i).intValue();}
        }
        return max;
    }

    //Approach 2: With O(n)

    private static int getMaxWithLinear(int[] a, int window){
         int max = Integer.MIN_VALUE;
         int min;
        for (int i = 0; i <a.length-window+1; i++) {
            min = a[i];
            for (int j = 1; j < window ; j++) {
                 if (a[j+i] < min)  min = a[j+i];
            }
            if (max < min) max = min;
        }

        PriorityQueue queue = new PriorityQueue();
        queue.peek();
        return  max;
    }
}
