package com.ns.algos;
 //Input
// a[] ={1,2,3,4}
//windowSize=2;

//output - Array[1.5,2.5,3.5];

public class FindingMean {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int window = 2;
        float [] mean = getMeanValues(array, window);
        for (float mn: mean) {
            System.out.println(mn);
        }
    }

    private static float[] getMeanValues(int[] input, int windowSize) {
        int number = input.length - windowSize + 1;
        float[] output = new float[number];
        int i = 0, sum = 0;

        for (int j = 0; j < input.length; j++) {
            if (j <= windowSize - 1) {
                sum += input[j];
                if (j == windowSize - 1) {
                    output[i] = sum / (float) windowSize;
                }
            } else {
                sum += input[j] - input[i];
                output[++i] = sum / (float) windowSize;
            }
        }

        return output;
    }

    //Option 2 - with O(n2)
    /*private static float[] getMeanValues(int[] input, int windowSize){
        int number= input.length - windowSize +1;
        float[] output = new float[number];
        int sum=0;

        for (int i = 0; i < number ; i++) {
            sum=0;
            for (int j = i; j < windowSize+i && j < input.length; j++) {
                sum += input[j];
            }
            output[i] = sum/(float)windowSize;
        }
        return output;
    }*/

}
