package Woo1;

import java.util.stream.IntStream;

// 5분 컷
public class Woo1Q5 {
    public int solution(int number) {
        return IntStream.rangeClosed(1, number)
            .map(Woo1Q5::calculate)
            .sum();
    }

    private static int calculate(int number) {
        int count = 0;
        for (char num : String.valueOf(number).toCharArray()) {
            if (num == '3' || num == '6' || num == '9') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Woo1Q5 woo1Q5 = new Woo1Q5();
        System.out.println(woo1Q5.solution(33));
    }
}
