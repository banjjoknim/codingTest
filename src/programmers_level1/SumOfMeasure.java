package programmers_level1;

import java.util.stream.IntStream;

// 22시 55분 23시 완료.
public class SumOfMeasure {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n)
            .filter(number -> n % number == 0)
            .sum();
    }

    public static void main(String[] args) {
        int n = 12;
        SumOfMeasure sumOfMeasure = new SumOfMeasure();
        System.out.println(sumOfMeasure.solution(n));
    }
}
