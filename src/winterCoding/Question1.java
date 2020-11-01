package winterCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 2020 윈터코딩 1번 문제
// 20점.
// 40분 소요.
public class Question1 {
    public String solution(int n, int[][] delivery) {
        Map<Integer, String> answer = new HashMap<>();
        for (int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 1) {
                answer.put(delivery[i][0], "O");
                answer.put(delivery[i][1], "O");
                continue;
            }
            if (delivery[i][2] == 0) {
                if (answer.getOrDefault(delivery[i][0], "d").equals("d") && answer.getOrDefault(delivery[i][1], "d")
                    .equals("d")) {
                    answer.put(delivery[i][0], "X");
                    answer.put(delivery[i][1], "X");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][0], "d").equals("O") && answer.getOrDefault(delivery[i][1], "d")
                    .equals("?")) {
                    answer.put(delivery[i][1], "X");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][1], "d").equals("O") && answer.getOrDefault(delivery[i][0], "d")
                    .equals("?")) {
                    answer.put(delivery[i][0], "X");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][0], "d").equals("O")) {
                    answer.put(delivery[i][1], "X");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][1], "d").equals("O")) {
                    answer.put(delivery[i][0], "X");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][0], "d").equals("X")) {
                    answer.put(delivery[i][1], "?");
                    continue;
                }
                if (answer.getOrDefault(delivery[i][1], "d").equals("X")) {
                    answer.put(delivery[i][0], "?");
                    continue;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!answer.containsKey(i)) {
                answer.put(i, "?");
            }
        }
        return answer.values().stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] delivery = new int[][] {{5, 6, 0}, {1, 3, 1}, {1, 5, 0}, {7, 6, 0}, {3, 7, 1}, {2, 5, 0}};
        Question1 question1 = new Question1();
        System.out.println(question1.solution(n, delivery));
    }
}
