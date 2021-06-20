package coupang;

import java.util.*;

// 1. 점수차가 같은게 반복되는 점수차 구하기.
// 2. 반복횟수 k와 비교해서 해킹된 점수차 구하기.
// 3. 2.에서 구한 점수차를 가진 등수들 제거
// 3. 남은 갯수 출력.
// 20시 57분 시작. 21시 56분 완료.
public class Coupang_Q3 {
    public int solution(int k, int[] score) {
        int[] temp = new int[score.length];
        int[] diff = new int[score.length - 1];
        Set<Integer> hacked = new HashSet<>();

        for (int i = 0; i < score.length - 1; i++) {
            diff[i] = score[i] - score[i + 1];
        }

        for (int i = 0; i < diff.length; i++) {
            int count = 0;
            for (int j = 0; j < diff.length; j++) {
                if (diff[i] == diff[j]) {
                    count++;
                }
            }
            if (count >= k) {
                hacked.add(diff[i]);
            }
        }

        if (hacked.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < score.length - 1; i++) {
            if (hacked.contains(score[i] - score[i + 1])) {
                temp[i] = -1;
                temp[i + 1] = -1;
            }
        }

        return (int) Arrays.stream(temp)
                .filter(num -> num != -1)
                .count();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {24, 22, 20, 10, 5, 3, 2, 1};
//        int[] score = {1300000000, 700000000, 668239490, 618239490, 568239490, 568239486, 518239486, 157658638, 157658634, 100000000, 100};
        Coupang_Q3 coupang_q3 = new Coupang_Q3();
        System.out.println(coupang_q3.solution(k, score));
    }
}
