package programmers_level2_skillCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        boolean[] check = {true, true, true, true};
        for (int i = 0; i < land.length; i++) {
            int[] row = land[i];
            List<Integer> list = new ArrayList<>();
            IntStream.range(0, 4)
                .filter(index -> check[index])
                .map(index -> row[index])
                .forEach(list::add);
            Collections.sort(list, Collections.reverseOrder());
            answer += list.get(0);
            for (int j = 0; j < 4; j++) {
                check[j] = true;
            }
            for (int j = 0; j < row.length; j++) {
                if (row[j] == list.get(0) && check[j]) {
                    check[j] = false;
                } else {
                    check[j] = true;
                }
            }
        }
        return answer;
    }

    int solution(int[] numbers, int target) {
        int answer = 0;
        target = 3;
        numbers = new int[] {1, 1, 1, 1, 1};
        boolean[] operator = new boolean[5];
        return answer;
    }

    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        Solution solution = new Solution();
        System.out.println(solution.solution(land));
    }
}
