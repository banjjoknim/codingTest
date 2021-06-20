package w1Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

// 03시 28분 시작 04시 05분 완료.
public class Q4 {
    public int solution(int[] pobi, int[] crong) {
        int answer = 0;
        int pobiScore = 0;
        int crongScore = 0;

        if (Arrays.stream(pobi).anyMatch(page -> page > 400 || page < 1)) {
            return -1;
        }
        if (Arrays.stream(crong).anyMatch(page -> page > 400 || page < 1)) {
            return -1;
        }
        if (pobi[1] - pobi[0] != 1 || crong[1] - crong[0] != 1) {
            return -1;
        }

        for (int i = 0; i < 2; i++) {
            int pageSide = i;
            int addPobi = IntStream.range(0, String.valueOf(pobi[i]).length())
                    .map(index -> Integer.parseInt(Character.toString(String.valueOf(pobi[pageSide]).charAt(index))))
                    .sum();
            int multiplePobi = IntStream.range(0, String.valueOf(pobi[i]).length())
                    .map(index -> Integer.parseInt(Character.toString(String.valueOf(pobi[pageSide]).charAt(index))))
                    .reduce(1, (a, b) -> a * b);
            if (multiplePobi >= addPobi && multiplePobi >= pobiScore) {
                pobiScore = multiplePobi;
            }
            if (multiplePobi < addPobi && addPobi >= pobiScore) {
                pobiScore = addPobi;
            }

            int addCrong = IntStream.range(0, String.valueOf(pobi[i]).length())
                    .map(index -> Integer.parseInt(Character.toString(String.valueOf(crong[pageSide]).charAt(index))))
                    .sum();
            int multipleCrong = IntStream.range(0, String.valueOf(pobi[i]).length())
                    .map(index -> Integer.parseInt(Character.toString(String.valueOf(crong[pageSide]).charAt(index))))
                    .reduce(1, (a, b) -> a * b);
            if (multipleCrong >= addCrong && multipleCrong >= crongScore) {
                crongScore = multipleCrong;
            }
            if (multipleCrong < addCrong && addCrong >= crongScore) {
                crongScore = addCrong;
            }
        }

        if (pobiScore > crongScore) {
            return 1;
        }
        if (pobiScore == crongScore) {
            return 0;
        }
        if (pobiScore < crongScore) {
            return 2;
        }

        return answer;
    }
}
