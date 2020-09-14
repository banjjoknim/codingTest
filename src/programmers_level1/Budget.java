package programmers_level1;

import java.util.Arrays;

// 예산
// 17시 23분 시작. 17시 32분 완료.
public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                budget = budget - d[i];
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        Budget budget1 = new Budget();
        System.out.println(budget1.solution(d, budget));
    }
}
