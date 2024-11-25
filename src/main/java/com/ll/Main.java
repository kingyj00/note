package com.ll;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // 일반
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        IntStream.rangeClosed(1, 10) // 1부터 10까지의 숫자 생성
                .filter(i -> i % 2 != 0) // 홀수만 필터링 (짝수 제거)
                .forEach(System.out::println); // 필터링된 숫자를 출력
    }
}