package programmers_level2;

import java.util.Arrays;

// 카펫
// 16시 44분 시작 17시 21분 완료. 기하학적으로 고려해볼 것.
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int i = 1; i <= total; i++) {
            int width = total / i;
            int height = total / width;
            if (brown == 2 * width + 2 * height - 4 && height >= 3 && width >= height) {
                answer[0] = width;
                answer[1] = height;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int brown = 50;
        int yellow = 22;
        Carpet carpet = new Carpet();
        System.out.println(Arrays.toString(carpet.solution(brown, yellow)));
    }
}
