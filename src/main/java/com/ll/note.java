package com.ll;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("입력: ");
            String input = scanner.nextLine();

            if (input.equals("생성")) {
                System.out.println("새로운 입력란 생성!");
            } else if (input.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("입력값: " + input);
            }
        }

        scanner.close();
    }
}