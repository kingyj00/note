package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 전화번호 {
    private final Scanner scanner;
    private int lastId;
    private final List<NumberBook>[] numberbooks;


    public 전화번호() {
        scanner = new Scanner(System.in);
        lastId = 0;
        numberbooks = new ArrayList<>();
    }

    public void run() {
        System.out.println("■■■■■■[ 번호 목록 ]■■■■■■");
        System.out.println("번호 등록을 원하면 [등록]");
        System.out.println("등록된 번호 목록 보려면 [목록]");
        System.out.println("종료를 원하면 [종료]");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");

        addNumberBook("홍길동", "010-0000-0000");

        while (true) {
            System.out.print("입력 : ");
            final String cmd = scanner.nextLine();

            if (cmd.equals("종료")) { break;
            } else if (cmd.equals("등록")) {
                actionAdd();
            } else if (cmd.equals("목록")) {
                actionList();
            }
        }
        scanner.close();
    }

    private NumberBook addNumberBook(String name, String number) {
        int id = ++lastId;

        NumberBook numberbook = new NumberBook(id, name, number);

        numberbooks.add(numberbook);

        return numberbook;
    }

    private void actionAdd() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("전화번호 : ");
        String number = scanner.nextLine();
        NumberBook numberbook = addNumberBook(name, number);

        System.out.println("%d번에 전화번호가 등록되었습니다.".formatted(numberbook.getId()));
    }

    private void actionList() {
        System.out.println("번호 / 이름 / 전화번호 ");
        System.out.println("========================");

        for (NumberBook numberBook : numberbooks) {
            System.out.println("%d / %s / %s".formatted(numberBook.getId(), numberBook.getname(), numberBook.getnumber()));
        }
    }
}
