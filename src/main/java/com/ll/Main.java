package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== NO Stream =====");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("===== 기존 Numbers =====");
        System.out.println(Arrays.toString(numbers));

        for (int i=0; i < numbers.length; i++){
            numbers[i] *= 2;
        }
        System.out.println("===== 변환된 Numbers =====");
        System.out.println(Arrays.toString(numbers));

        System.out.println("===== Stream =====");

        System.out.println("===== Stream(x) Numbers =====");
        numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        int[] calculatedNumbers = Arrays.stream(numbers)
                .map(e -> e * 2)
                .toArray();

        System.out.println("===== Stream(o) Numbers =====");
        System.out.println(Arrays.toString(numbers));

        System.out.println("===== Stream 새 배열 calculatedNumbers =====");
        System.out.println(Arrays.toString(numbers));
    }
}

