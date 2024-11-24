package com.ll;

public class Main {
    public static void main(String[] args) {
        }
}class Solution {
    public int solution(int n) {
        int sum = 0; // 약수의 합을 저장할 변수

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // n이 i로 나누어 떨어지면 i는 약수
                sum += i;
            }
        }

        return sum;
    }
}