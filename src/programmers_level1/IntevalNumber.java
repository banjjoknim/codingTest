package programmers_level1;

import java.util.stream.LongStream;

// 22시 58분 시작. 23시 08분 완료.
public class IntevalNumber {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n)
                .map(index -> x * index)
                .toArray();
    }
}
