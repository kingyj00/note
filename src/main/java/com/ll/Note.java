package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> quotes = new ArrayList<>();
        quotes.add("행복은 습관이다. 그것을 몸에 지녀라. - 허버드");
        quotes.add("성공은 실패를 거듭해도 열정을 잃지 않는 것이다. - 윈스턴 처칠");
        quotes.add("길을 아는 것과 그 길을 걷는 것은 다르다. - 매트릭스");
        quotes.add("포기하지 마라. 꿈꾸는 자만이 성공한다. - 익명");
        quotes.add("기회는 일어나는 것이 아니라 만들어지는 것이다. - 크리스 그로서");

        while (true) {
            System.out.println("== 명언 앱 ==");
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("등록")) {
                System.out.print("명언 입력: ");
                String quote = scanner.nextLine();
                System.out.print("작가 입력: ");
                String author = scanner.nextLine();

                String newQuote = quote + " - " + author;
                quotes.add(newQuote);
                System.out.println("✅ 명언이 등록되었습니다!\n");
            } else if (command.equals("랜덤")) {
                if (quotes.isEmpty()) {
                    System.out.println("⚠️ 저장된 명언이 없습니다.\n");
                } else {
                    int index = random.nextInt(quotes.size());
                    System.out.println("💬 명언: " + quotes.get(index) + "\n");
                }
            } else if (command.equals("목록")) {
                if (quotes.isEmpty()) {
                    System.out.println("⚠️ 저장된 명언이 없습니다.\n");
                } else {
                    System.out.println("📜 저장된 명언 목록:");
                    for (int i = 0; i < quotes.size(); i++) {
                        System.out.println((i + 1) + ". " + quotes.get(i));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("⚠️ 올바른 명령을 입력하세요! (등록 / 랜덤 / 목록 / 종료)\n");
            }
        }

        scanner.close();
    }
}