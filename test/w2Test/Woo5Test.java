package w2Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import w2.Woo5;

public class Woo5Test {

    @ParameterizedTest
    @ValueSource(strings = {
            "0[0.0]", "1[-1.0]", "2[0.5]", "3[1.2]", "4[3.0]", "5[1.0]", "6[1.5]",
            "7[2.0]", "8[1.0, 2.0, 1.0]", "9[1.0, 1.0, 2.0, 2.0]",
            "10[1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 2.0, 2.0, 1.0, 2.0, 2.0, 2.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 2.0, 1.0, 2.0]",
            "11[1.5, 2.0, 1.0]", "12[1.5, 2.5, 1.0, 1.0]",
            "13[1.5, 2.5, 1.0, 2.5, 1.0]", "14[1.5, 2.5, 1.0, -1.0]",
            "15[1.5, 0.5, 1.0, 2.0]", "16[1.5, 2.5, 1.0, 2.0, 1.2]",
            "17[1.5, 2.5, 1.0, 3.0, 1.5]",
            "18[1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0, 1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0, 1.5, 2.5, 1.0, 2.0, 1.5, 2.0, 2.0, 2.0]",
            "19[1.5, 2.5, 0.0, 1.0]"
    })
    void test(String history) {

        int[][] correctAnswer = {
                {-1}, {-1}, {-1}, {-1}, {-1}, {3000}, {14000}, {14000}, {3000, 14000, 11000},
                {3000, 11000, 14000, 7000},
                {3000, 11000, 14000, 7000, 13000, 1000, 14000, 17000, 3000, 15000, 17000, 14000, 1000, 16000, 15000, 3000,
                        4000, 13000, 15000, 6000, 11000, 14000, 4000, 16000}
                , {14000, 3000, 15000}, {14000, 13000, 4000, 3000},
                {14000, 13000, 4000, 17000, 3000}, {-1}, {-1}, {-1}, {-1},
                {14000, 13000, 4000, 16000, 5000, 14000, 16000, 15000, 2000, 18000, 11000, 16000, 4000, 14000, 17000, 15000,
                        3000, 16000, 11000, 7000, 14000, 14000, 17000, 4000}
                , {-1}
        };

        Woo5 woo5 = new Woo5();
        System.out.println(history.substring(0, history.indexOf("[")));
        int index = Integer.parseInt(history.substring(0, history.indexOf("[")));
        int[] answer = woo5.solution(
                history.substring(history.indexOf("[")).replace("[", "").replace("]", "").split(", "));
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        Assertions.assertArrayEquals(answer, correctAnswer[index]);
    }

}

