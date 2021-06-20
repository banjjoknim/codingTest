package programmers_level1;

import java.util.Arrays;

// 22시 53분 시작. 22시 57분 완료.
public class NaturalNumberReverse {
    public int[] solution(long n) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
        stringBuilder.reverse();
        return Arrays.stream(String.valueOf(stringBuilder).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
