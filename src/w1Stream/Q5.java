package w1Stream;

import java.util.stream.IntStream;

// 04시 06분 시작 04시 21분 완료.
public class Q5 {
    public int solution(int number) {
        int answer = IntStream.range(1, number + 1)
            .map(numberInStream -> (int)IntStream.range(0, String.valueOf(numberInStream).length())
                .filter(
                    index -> Integer.parseInt(Character.toString(String.valueOf(numberInStream).charAt(index))) % 3 == 0
                        && Integer.parseInt(Character.toString(String.valueOf(numberInStream).charAt(index))) != 0)
                .count())
            .sum();
        return answer;
    }
}
