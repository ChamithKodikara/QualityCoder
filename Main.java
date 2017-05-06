package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] numberList;

    public static void main(String[] args) {

        System.out.println("Calculate Min -");
        inputNumbers();
        System.out.println("The Min is - " + Arrays.stream(numberList).min().getAsInt());

        System.out.println("Calculate Max -");
        inputNumbers();
        System.out.println("The Max is - " + Arrays.stream(numberList).max().getAsInt());
    }

    public static void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        numberList = new int[10];
        int length = 0;
        while (length < 10) {
            numberList[length] = scanner.nextInt();
            length++;
        }
    }

    public static int calculateMin(int[] numberList) {
        int min = numberList[0];
        for (int i = 1; i < numberList.length; i++) {
            if (min > numberList[i]) {
                min = numberList[i];
            }
        }
        return min;
    }

    public static int calculateMax(int[] numberList) {
        int max = numberList[0];
        for (int i = 1; i < numberList.length; i++) {
            if (max < numberList[i]) {
                max = numberList[i];
            }
        }
        return max;
    }

}
