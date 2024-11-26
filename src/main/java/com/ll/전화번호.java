package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 전화번호 {
    private final Scanner scanner;
    private int lastId;
    private final List<NumberBook> numberBooks;
// error solve : 왜 []이딴걸 처넣고 처넣은지도 몰랐을까...

    public 전화번호() {
        scanner = new Scanner(System.in);
        lastId = 0;
        numberBooks = new ArrayList<>();
    }

    public void run() {
        System.out.println("■■■■■■■[ 가이드 ]■■■■■■■");
        System.out.println("번호 등록을 원하면 [등록]");
        System.out.println("등록된 번호 목록 보려면 [목록]");
        System.out.println("종료를 원하면 [종료]");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");

        makeSampleData();

        while (true) {
            System.out.print("입력 : ");
            final String cmd = scanner.nextLine();

            if (cmd.equals("종료")) { break;
            } else if (cmd.equals("등록")) {
                actionAdd();
            } else if (cmd.equals("목록")) {
                actionList();
            } else if (cmd.startsWith("삭제")){
                String idStr = cmd.substring(6);
                int id = Integer.parseInt(idStr);
                actionDelete(id);
            }
        }
        scanner.close();
    }

    private void makeSampleData() {
        addNumberBook("홍길동", "010-0000-0000");
    }

    private NumberBook addNumberBook(String name, String number) {
        int id = ++lastId;

        NumberBook numberbook = new NumberBook(id, name, number);

        numberBooks.add(numberbook);

        return numberbook;
    }

    // ★ 액션 코드
    private void actionAdd() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("전화번호 : ");
        String number = scanner.nextLine();
        NumberBook numberbook = addNumberBook(name, number);

        System.out.println("%d번에 전화번호가 등록되었습니다.".formatted(numberbook.getId()));
    }

    private void actionList() {
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("       번호 목록     ");
        System.out.println("번호 / 이름 / 전화번호 ");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■");

        for (NumberBook numberBook : numberBooks.reversed()){
            System.out.println("%d / %s / %s".formatted(numberBook.getId(), numberBook.getname(),numberBook.getnumber()));
        }

    }

    private void actionDelete(int id) {
        boolean removed = numberBooks.removeIf(numberBook -> numberBook.getId() == id);

        if (removed) System.out.println("%d번에 전화번호가 삭제되었습니다.".formatted(id));
        else System.out.println("%d번에 전화번호가 없습니다.".formatted(id));;
    }
}
