package programmers_level1;

import java.util.Arrays;

// 12시 05분 시작. 12시 28분 완료.
public class RemoveLeastNumber {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = Arrays.stream(arr)
            .filter(number -> number != min)
            .toArray();

        if (answer.length == 0) {
            return new int[] {-1};
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveLeastNumber removeLeastNumber = new RemoveLeastNumber();
        Arrays.stream(removeLeastNumber.solution(new int[] {3, 1, 2, 4}))
            .forEach(System.out::println);
    }
}
