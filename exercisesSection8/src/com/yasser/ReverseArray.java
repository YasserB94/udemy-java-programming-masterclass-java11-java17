package com.yasser;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] l = {4,29,4,3,2,1,9,50};
        reverse(l);
    }
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversed = new int[array.length];

        for (int i = array.length-1,j = 0; i >=0 ; i--,j++) {
            reversed[j] = array[i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }
}
