package programmers_level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// N개의 최소공배수
// 11시 40분 시작 12시 11분 완료.
// 1. 최대공약수 구하기
// 2. 최대공약수로 각각의 수를 나눈 값 구하기
// 3. 최대공약수 * 각각의 수를 나눈 값 모두 곱하기
public class LeastCommonMultipleN {
    public int solution(int[] arr) {
        int leastCommonMultiple = getLeastCommonMultiple(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            leastCommonMultiple = getLeastCommonMultiple(leastCommonMultiple, arr[i]);
        }
        return leastCommonMultiple;
    }

    int getLeastCommonMultiple(int a, int b) {
        int[] numbers = new int[101];
        Arrays.fill(numbers, 1);
        for (int i = 1; i < 101; i++) {
            if (a % i == 0 && b % i == 0) {
                numbers[i] = i;
            }
        }
        int max = Arrays.stream(numbers)
                .max()
                .getAsInt();
        return max * (a / max) * (b / max);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        LeastCommonMultipleN leastCommonMultipleN = new LeastCommonMultipleN();
        System.out.println(leastCommonMultipleN.solution(arr));
    }
}
