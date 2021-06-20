package Woo2;

// 4분 컷
public class Woo2Q1 {
    public int solution(int[] restaurant, int[][] riders, int k) {
        int answer = 0;
        for (int i = 0; i < riders.length; i++) {
            if (Math.pow(restaurant[0] - riders[i][0], 2) + Math.pow(restaurant[1] - riders[i][1], 2) <= Math.pow(k,
                    2)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] restaurant = {0, 0};
        int[][] riders = {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500}, {-1100, 900}};
        Woo2Q1 woo2Q1 = new Woo2Q1();
        System.out.println(woo2Q1.solution(restaurant, riders, 1000));
        ;
    }
}
