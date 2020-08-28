package w2Stream;

import java.util.Arrays;

//02시 10분 시작. 02시 13분 완료.
//2차원 배열을 스트림으로 구조변경 02시 40분 완료. 2차원배열.....
public class Question1 {
    public int solution(int[] restaurant, int[][] riders, int k) {

        return (int)Arrays.stream(riders)
            .mapToInt(rider -> calculateDistance(restaurant, rider))
            .filter(item -> item <= k)
            .count();
    }

    private int calculateDistance(int[] restaurant, int[] rider) {
        return (int)Math.sqrt(
            ((restaurant[0] - rider[0]) * (restaurant[0] - rider[0]) + (restaurant[1] - rider[1]) * (restaurant[1]
                - rider[1])));
    }

}
