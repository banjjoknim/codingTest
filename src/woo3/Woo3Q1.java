package woo3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Woo3Q1 {
    public int solution(String[] grades, int[] weights, int threshold) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A+", 10);
        map.put("A0", 9);
        map.put("B+", 8);
        map.put("B0", 7);
        map.put("C+", 6);
        map.put("C0", 5);
        map.put("D+", 4);
        map.put("D0", 3);
        map.put("F", 0);
        int sum = IntStream.range(0, grades.length)
                .map(index -> map.get(grades[index]) * weights[index])
                .sum();

        return sum - threshold;
    }

    public static void main(String[] args) {
        Woo3Q1 woo3Q1 = new Woo3Q1();
        String[] grades = {"B+", "A0", "C+"};
        int[] weights = {6, 7, 8};
        int threshold = 200;
        System.out.println(woo3Q1.solution(grades, weights, threshold));
    }
}
