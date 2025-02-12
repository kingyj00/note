package com.ll;

import java.util.*;

class Solution {
    public int solution(int k, int n, int[][] reqs) {
        // 멘토 그룹을 유형별로 관리
        List<Queue<Integer>> mentors = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            mentors.add(new PriorityQueue<>());
        }

        int totalWaitTime = 0;

        // 요청들을 시작 시간 순으로 정렬
        Arrays.sort(reqs, Comparator.comparingInt(a -> a[1]));

        for (int[] req : reqs) {
            int participantType = req[2] - 1; // 0-based index
            int startTime = req[1];
            int duration = req[0];

            Queue<Integer> mentorQueue = mentors.get(participantType);

            // 멘토 중에서 가장 빨리 끝나는 시간 확인 및 업데이트
            while (!mentorQueue.isEmpty() && mentorQueue.peek() <= startTime) {
                mentorQueue.poll();
            }

            if (mentorQueue.size() < n / k) {
                // 멘토 여유가 있으면 즉시 상담
                mentorQueue.offer(startTime + duration);
            } else {
                // 가장 빨리 끝나는 멘토를 찾아야 함
                int earliestEnd = mentorQueue.poll();
                totalWaitTime += earliestEnd - startTime;
                mentorQueue.offer(earliestEnd + duration);
            }
        }

        return totalWaitTime;
    }
}