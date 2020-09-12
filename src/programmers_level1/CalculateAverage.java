package programmers_level1;

import java.util.Arrays;

// 22시 40분 시작 22시 44분 완료.
public class CalculateAverage {
    public double solution(int[] arr) {
        return Arrays.stream(arr).sum() / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.stream(arr).sum() / (double) arr.length);
    }
}
