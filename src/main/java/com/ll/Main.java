package com.ll;

public class Main {
    public static void main(String[] args) {
        int age = 5;

// v1
        if ( age < 10 ) { System.out.println("아동/영유아"); }
        else if ( age < 20 ) { System.out.println("10대"); }
        else { System.out.println("20대 이상"); } // 전체(3가지) 경우의 수 중에서 무조건 정답이 1개 존재한다면, 마지막 if문의 조건식은 지우는게 좋다.

    }
}
