package programmers_level1_skillCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    // 1번 문제
    public int solution1(String s) {
        int answer = 0;
        answer = Integer.valueOf(s);
        return answer;
    }

    // 2번 문제
    public int[] solution2(long n) {
        int[] answer = new int[String.valueOf(n).split("").length];
        String[] strArray = String.valueOf(n).split("");
        String[] strArray2 = String.valueOf(n).split("");
        for (int i = 0; i < strArray.length; i++) {
            strArray2[i] = strArray[strArray.length - i - 1];
        }
        for (int i = 0; i < strArray2.length; i++) {
            answer[i] = Integer.valueOf(strArray2[i]);
        }
        return answer;
    }

    // 추가 문제
    public String solution3(String s) {

        String answer = "";
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : chars) {
            list.add(c);
        }
        Collections.sort(list, Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution3("Zbcdefg"));
    }
}
