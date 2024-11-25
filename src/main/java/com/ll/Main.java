package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 문자열 배열
        String[] input = {"1번", "2번", "3번"};

        // 짝수 제거하고 정수 배열로 변환
        int[] result = Arrays.stream(input) // 문자열 배열을 스트림으로 변환
                .map(s -> Integer.parseInt(s.replaceAll("[^0-9]", ""))) // 숫자만 추출
                .filter(num -> num % 2 != 0) // 짝수 제거
                .mapToInt(num -> num) // int 스트림으로 변환
                .toArray(); // 결과를 int 배열로 변환

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }
}