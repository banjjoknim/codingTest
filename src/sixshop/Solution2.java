package sixshop;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        for (int i = 0; i < grade.length; i++) {
            int currentStudentScore = grade[i];
            int count = 0;
            for (int j = 0; j < grade.length; j++) {
                int max = Math.max(currentStudentScore, grade[j]);
                if (max == currentStudentScore) {
                    continue;
                }
                if (max > currentStudentScore) {
                    count++;
                }
            }
            answer[i] = count + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] grade = {3,2,1,2};
        System.out.println(Arrays.toString(solution2.solution(grade)));
    }
}
