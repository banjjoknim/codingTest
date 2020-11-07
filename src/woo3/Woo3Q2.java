package woo3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Woo3Q2 {
    public long[] solution(String s, String op) {
        long[] answer = new long[s.length() - 1];
        String[] strings = s.split("");
        for (int i = 0; i < strings.length - 1; i++) {
            String s1 = Arrays.stream(strings)
                .limit(i + 1)
                .collect(Collectors.joining());
            String s2 = Arrays.stream(strings)
                .skip(i + 1)
                .collect(Collectors.joining());

            if ("+".equals(op)) {
                answer[i] = Long.valueOf(s1) + Long.valueOf(s2);
            }
            if ("-".equals(op)) {
                answer[i] = Long.valueOf(s1) - Long.valueOf(s2);
            }
            if ("*".equals(op)) {
                answer[i] = Long.valueOf(s1) * Long.valueOf(s2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Woo3Q2 woo3Q2 = new Woo3Q2();
        String s = "1234";
        String op = "+";
        System.out.println(Arrays.toString(woo3Q2.solution(s, op)));
    }
}
