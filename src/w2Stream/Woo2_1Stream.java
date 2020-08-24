package w2Stream;

import java.util.Arrays;

//02시 10분 시작. 02시 13분 완료.
//2차원 배열을 스트림으로 구조변경 02시 40분 완료. 2차원배열.....
public class Woo2_1Stream {
    public int solution(int[] restaurant, int[][] riders, int k) {
        int answer = 0;
        restaurant = new int[] {0, 0};
        riders = new int[][] {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500}, {-1100, 900}};
        k = 1000;
        int[][] riderArray = Arrays.stream(riders).map(item -> new int[] {item[0], item[1]}).toArray(int[][]::new);
        //2차원배열을 스트림으로 다루는 연습할 것..
        for (int i = 0; i < riderArray.length; i++) {
            int diffX = (restaurant[0] - riderArray[i][0]) * (restaurant[0] - riderArray[i][0]);
            int diffY = (restaurant[1] - riderArray[i][1]) * (restaurant[1] - riderArray[i][1]);
            if (diffX + diffY <= k * k) {
                answer = answer + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Woo2_1Stream woo2_1Stream = new Woo2_1Stream();
        int[] restaurant = new int[] {0, 0};
        int[][] riders = new int[][] {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500},
            {-1100, 900}};
        int k = 1000;
        System.out.println(woo2_1Stream.solution(restaurant, riders, k));
    }
}
