package programmers_level2;

import java.util.Arrays;

// 최댓값과 최솟값
// 16시 25분 시작. 16시 29분 완료.
public class GreatestAndLeast {
    public String solution(String s) {
        int[] numbers = new int[s.split(" ").length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf(s.split(" ")[i]);
        }
        Arrays.sort(numbers);

        String least = String.valueOf(numbers[0]);
        String greatest = String.valueOf(numbers[numbers.length - 1]);

        return least + " " + greatest;
    }
}
