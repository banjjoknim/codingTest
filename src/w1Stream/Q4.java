package w1Stream;

import java.util.Arrays;

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
        for (int i = 0; i < pobi.length; i++) {
            int add = 0;
            int multiple = 1;
            for (int j = 0; j < String.valueOf(pobi[i]).length(); j++) {
                add += Integer.parseInt(Character.toString(String.valueOf(pobi[i]).charAt(j)));
                multiple = multiple * Integer.parseInt(Character.toString(String.valueOf(pobi[i]).charAt(j)));
            }
            if (multiple >= add && multiple >= pobiScore) {
                pobiScore = multiple;
            }
            if (multiple < add && add >= pobiScore) {
                pobiScore = add;
            }
        }

        for (int i = 0; i < crong.length; i++) {
            int add = 0;
            int multiple = 1;
            for (int j = 0; j < String.valueOf(crong[i]).length(); j++) {
                add += Integer.parseInt(Character.toString(String.valueOf(crong[i]).charAt(j)));
                multiple = multiple * Integer.parseInt(Character.toString(String.valueOf(crong[i]).charAt(j)));
            }
            if (multiple >= add && multiple >= crongScore) {
                crongScore = multiple;
            }
            if (multiple < add && add >= crongScore) {
                crongScore = add;
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
