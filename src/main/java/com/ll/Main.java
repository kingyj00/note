package com.ll;

import java.util.Scanner;

// 개인 참조 : 38강(완)
// 참고 : 명언게시판 5단계 / 38강
// 단계 : 목록에 예시표기, 함수 묶어두기, 등록/종료 입력값, 이름/번호 등록, 등록시 알림.

public class Main {
    public static void main(String[] args) {
        전화번호 app = new 전화번호();
        app.run ();
    }
}
class 전화번호 {
    private Scanner scanner;
    private int lastId;
    private NumberBook[] numberbooks;
    private int size;

    public 전화번호() {
        scanner = new Scanner(System.in);
        lastId = 0;
        numberbooks = new NumberBook[100];
        size = 0;
    }

    public void run() {
        System.out.println("■■■■■■[ 번호 목록 ]■■■■■■");
        System.out.println("번호 등록을 원하면 [등록]");
        System.out.println("등록된 번호 목록 보려면 [목록]");
        System.out.println("종료를 원하면 [종료]");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");

        add("홍길동","010-0000-0000");

        while (true) {
            System.out.print("입력 : ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
               actionAdd();
            } else if (cmd.equals("목록")) {
               actionList();
            }
        }
        scanner.close();
    }

    private NumberBook add (String name, String number) {
        int id = ++lastId;

        NumberBook numberbook = new NumberBook(id, name, number);

        numberbooks[size] = numberbook;
        size++;

        return numberbook;
    }

    private void actionAdd(){
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("전화번호 : ");
        String number = scanner.nextLine();
        NumberBook numberbook = add(name, number);

        System.out.println("%d번에 전화번호가 등록되었습니다.".formatted(numberbook.id));
    }

    private void actionList(){
        System.out.println("번호 / 이름 / 전화번호 ");
        System.out.println("========================");

        for (NumberBook numberBook : numberbooks) {
            if (numberBook == null) break;
            System.out.println("%d / %s / %s".formatted(numberBook.id, numberBook.name, numberBook.number));
        }
    }
}

class NumberBook {
    int id;
    String name;
    String number;

    NumberBook(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberBook (id=%d, name=\"%s\", number=\"%s\")".formatted(id, name, number);
    }
}