package programmers_level1;

import java.util.ArrayList;
import java.util.List;

// 다트 게임
// 09시 48분 시작. 11시 27분 완료.
public class DartGame {

    public int solution(String dartResult) {
        List<Integer> scores = new ArrayList<>();
        char[] chars = dartResult.toCharArray();

        int chanceIndex = 1;
        for (int j = 0; j < chars.length; j++) {
            int exponent = 0;
            if ('A' <= chars[j] && chars[j] <= 'Z') {
                if (chars[j] == 'S') {
                    exponent = 1;
                }
                if (chars[j] == 'D') {
                    exponent = 2;
                }
                if (chars[j] == 'T') {
                    exponent = 3;
                }
                if (exponent != 0) {
                    if (j >= 2) {
                        if (chars[j - 1] == '0' && chars[j - 2] == '1') {
                            scores.add((int) (Math.pow(10, exponent)));
                            continue;
                        }
                    }
                    scores.add((int) (Math.pow(Double.valueOf(String.valueOf(chars[j - 1])), exponent)));
                    continue;
                }
            }

            if (scores.size() == chanceIndex) {
                if (chanceIndex == 1) {
                    if (chars[j] == '*') {
                        scores.set(chanceIndex - 1, scores.get(chanceIndex - 1) * 2);
                    }
                    if (chars[j] == '#') {
                        scores.set(chanceIndex - 1, scores.get(chanceIndex - 1) * -1);
                    }
                    chanceIndex += 1;
                    continue;
                }
                if (chanceIndex > 1) {
                    if (chars[j] == '*') {
                        scores.set(chanceIndex - 2, scores.get(chanceIndex - 2) * 2);
                        scores.set(chanceIndex - 1, scores.get(chanceIndex - 1) * 2);
                    }
                    if (chars[j] == '#') {
                        scores.set(chanceIndex - 1, scores.get(chanceIndex - 1) * -1);
                    }
                    chanceIndex += 1;
                    continue;
                }
            }
        }

        return scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        DartGame dartGame = new DartGame();
        String dartResult = "1D2S#10S";
        System.out.println(dartGame.solution(dartResult));
    }
}
