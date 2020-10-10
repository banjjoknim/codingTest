package Dev_Matching;

import java.util.Arrays;

// 15시 50분 시작. 16시 종료. 실패!
// 1. 배열 조합 찾기
// 2. 배열 조합에 따라 전구 상태 변경.
// 3. 배열 조합의 갯수 + 남은 전구 갯수 더하기.
public class Dev_Q3 {
    public int solution(int n, int[][] groups) {
        int answer = 0;
        int[] array = new int[n];
        turnOff(1,5, array);
        System.out.println(Arrays.toString(array));
        return answer;
    }

    private void turnOff(int min, int max, int[] array) {
        Arrays.fill(array, min, max, -1);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] groups = {{1, 5}, {2, 7}, {4, 8}, {3, 6}};
        Dev_Q3 dev_q3 = new Dev_Q3();
        System.out.println(dev_q3.solution(n, groups));
    }
}
