package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        전화번호 app = new 전화번호();
        app.run ();
    }
}

class 전화번호 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("번호 목록");

        while (true) {
            System.out.println("명령 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) break;

            System.out.println("입력값 : " + cmd);
        }
        scanner.close();
    }
}