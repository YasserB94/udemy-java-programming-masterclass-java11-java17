package com.yasser;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
    }

    private static int[] readElements(int a) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] input){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            min = Math.min(min,input[i]);
        }
        return min;
    }
}