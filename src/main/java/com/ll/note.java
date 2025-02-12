package com.ll;

import java.util.*;

class Solution {
    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        int[] start = new int[2];
        int[] goal = new int[2];

        // 시작 위치와 목표 위치 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    start[0] = i;
                    start[1] = j;
                } else if (board[i].charAt(j) == 'G') {
                    goal[0] = i;
                    goal[1] = j;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});
        boolean[][] visited = new boolean[n][m];
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int steps = current[2];

            if (x == goal[0] && y == goal[1]) {
                return steps;
            }

            for (int[] dir : directions) {
                int nx = x;
                int ny = y;

                while (true) {
                    nx += dir[0];
                    ny += dir[1];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m || board[nx].charAt(ny) == 'D') {
                        nx -= dir[0];
                        ny -= dir[1];
                        break;
                    }
                }

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, steps + 1});
                }
            }
        }

        return -1;
    }
}