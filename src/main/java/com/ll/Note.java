package com.ll;

import java.util.Scanner;
import java.util.Random;

public class Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] quotes = {
                "행복은 습관이다. 그것을 몸에 지녀라. - 허버드",
                "성공은 실패를 거듭해도 열정을 잃지 않는 것이다. - 윈스턴 처칠",
                "길을 아는 것과 그 길을 걷는 것은 다르다. - 매트릭스",
                "포기하지 마라. 꿈꾸는 자만이 성공한다. - 익명",
                "기회는 일어나는 것이 아니라 만들어지는 것이다. - 크리스 그로서"
        };

        while (true) {
            System.out.println("== 명언 앱 ==");
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 랜덤 명언 출력
            int index = random.nextInt(quotes.length);
            System.out.println("💬 명언: " + quotes[index] + "\n");
        }

        scanner.close();
    }
}