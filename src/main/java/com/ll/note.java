package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> notes = new ArrayList<>();

        while (true) {
            System.out.print("입력: ");
            String input = scanner.nextLine();

            if (input.equals("생성")) {
                System.out.print("새로운 입력: ");
                String newNote = scanner.nextLine();
                notes.add(newNote);
                System.out.println("입력란 추가됨! 현재 개수: " + notes.size());
            } else if (input.equals("목록")) {
                if (notes.isEmpty()) {
                    System.out.println("저장된 입력이 없습니다.");
                } else {
                    System.out.println("저장된 입력 목록:");
                    for (int i = 0; i < notes.size(); i++) {
                        System.out.println((i + 1) + ". " + notes.get(i));
                    }
                }
            } else if (input.startsWith("삭제 ")) {
                try {
                    int index = Integer.parseInt(input.split(" ")[1]) - 1;
                    if (index >= 0 && index < notes.size()) {
                        notes.remove(index);
                        System.out.println("입력이 삭제되었습니다.");
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                } catch (Exception e) {
                    System.out.println("삭제 형식: 삭제 [번호]");
                }
            } else if (input.startsWith("수정 ")) {
                try {
                    String[] parts = input.split(" ", 3);
                    int index = Integer.parseInt(parts[1]) - 1;
                    String newText = parts[2];

                    if (index >= 0 && index < notes.size()) {
                        notes.set(index, newText);
                        System.out.println("입력이 수정되었습니다.");
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                } catch (Exception e) {
                    System.out.println("수정 형식: 수정 [번호] [새로운 값]");
                }
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