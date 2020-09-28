package programmers_level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// H-index
// 11시 33분 시작. 12시 19분 중지. 13시 2분 시작. 13시 24분 중지. 14시 5분 시작. 14시 30분 완료.
// 풀이 보고 풀었음.. 문제가 이해하기 힘들었다. 위키백과 보고나서 풀 수 있었음.
public class HIndex {
    public int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= i + 1) {
                max = i + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.solution(citations));
    }
}
