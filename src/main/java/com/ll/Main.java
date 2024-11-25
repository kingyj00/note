package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        전화번호 app = new 전화번호();
        app.run ();
    }
}

class 전화번호 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("■■■■■■[ 번호 목록 ]■■■■■■");
        System.out.println("번호 등록을 원하면 [등록]");
        System.out.println("종료를 원하면 [종료]");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");


        while (true) {
            System.out.print("입력 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("전화번호 : ");
                String number = scanner.nextLine();

            }
        }
        scanner.close();
    }
}

