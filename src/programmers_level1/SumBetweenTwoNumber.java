package programmers_level1;

import java.util.Arrays;

// 19시 22분 시작 19시 30분 완료.
public class SumBetweenTwoNumber {
    public long solution(int a, int b) {
        int[] numbers = {a, b};
        Arrays.sort(numbers);
        // for (int i = numbers[0]; i <= numbers[1]; i++) {
        //     answer += i;
        // }
        return (numbers[1] - numbers[0] + 1) * (numbers[1] + numbers[0]) / 2;
    }
}
