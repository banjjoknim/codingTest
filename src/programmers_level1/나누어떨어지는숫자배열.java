package programmers_level1;

import java.util.Arrays;

// 23시 04분 시작 23시 13분 완료.
public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
            .filter(number -> number % divisor == 0)
            .toArray();
        if (answer.length == 0) {
            return new int[] {-1};
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 나누어떨어지는숫자배열 = new 나누어떨어지는숫자배열();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(나누어떨어지는숫자배열.solution(arr, divisor)[0]);
    }
}
