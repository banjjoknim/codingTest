package Woo1;

import java.util.Arrays;

// 4분 컷
public class Woo1Q1 {
    public int[] solution(int money) {
        int[] divider = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] answer = new int[divider.length];
        for (int i = 0; i < divider.length; i++) {
            answer[i] = money / divider[i];
            money = money % divider[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Woo1Q1 woo1Q1 = new Woo1Q1();
        System.out.println(Arrays.toString(woo1Q1.solution(15000)));
    }
}
