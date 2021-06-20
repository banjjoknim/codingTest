package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 23시 30분 시작 23시 49분 완료./ 효율성 테스트 실패.
public class HateSameNumber {
    public int[] solution(int[] arr) {

        // List<Integer> numbers = new ArrayList<>();
        // for (int number : arr) {
        //     numbers.add(number);
        // }
        // int size = numbers.size();
        // for (int i = 0; i < size - 1; i++) {
        //     if (numbers.get(i) == numbers.get(i + 1)) {
        //         numbers.remove(i);
        //     }
        // }
        // int[] answer = new int[numbers.size()];
        // for (int i = 0; i < numbers.size(); i++) {
        //     answer[i] = numbers.get(i);
        // }
        // return answer;

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
                continue;
            }

            if (answer.get(answer.size() - 1).equals(arr[i])) {
                continue;
            }
            answer.add(arr[i]);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        HateSameNumber hateSameNumber = new HateSameNumber();
        Arrays.stream(hateSameNumber.solution(arr)).forEach(System.out::println);
    }
}
