package programmers_level1;

import java.util.Arrays;

// 20시 53분 시작 20시 55분 완료.
public class HashadNumber {
    public boolean solution(int x) {
        return x % Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt)
                .sum() == 0;
    }
}
