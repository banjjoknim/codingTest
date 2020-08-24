package w2Stream;

import java.util.Arrays;

//02시 10분 시작. 02시 13분 완료.
//2차원 배열을 스트림으로 구조변경 02시 40분 완료. 2차원배열.....
public class Woo2_1Stream {
    public int solution(int[] restaurant, int[][] riders, int k) {
        
        int[][] riderArray = Arrays.stream(riders).map(item -> new int[] {item[0], item[1]}).toArray(int[][]::new);

        int answer = (int)Arrays.stream(Arrays.stream(riderArray)
            .map(item -> (restaurant[0] - item[0]) * (restaurant[0] - item[0]) + (restaurant[1] - item[1]) * (
                restaurant[1] - item[1])).filter(item -> item < k * k).toArray()).count();

        return answer;
    }
}
