package programmers_level1;

import java.util.Arrays;

public class NumberK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] numArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(numArray);
            answer[i] = numArray[commands[i][2] - 1];
        }
        return answer;
    }
}
