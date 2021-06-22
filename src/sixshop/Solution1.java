package sixshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
    public String solution(String s1, String s2) {
        int overlapCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                String substring = s1.substring(i, j);
                if (s2.contains(substring)) {
                    overlapCount = Math.max(overlapCount, substring.length());
                }
            }
        }
        StringBuilder s1builder = new StringBuilder(s1);
        StringBuilder s2builder = new StringBuilder(s2);
        boolean isS1First = s1.substring(s1.length() - overlapCount).equals(s2.substring(0, overlapCount));
        boolean isS2First = s2.substring(s2.length() - overlapCount).equals(s1.substring(0, overlapCount));
        List<String> strings = new ArrayList<>();
        String result2 = s2builder.replace(s2.length() - overlapCount, s2.length(), "").append(s1).toString();
        String result1 = s1builder.replace(s1.length() - overlapCount, s1.length(), "").append(s2).toString();
        if (result1.length() < result2.length() && isS1First) {
            return result1;
        }
        if (result1.length() > result2.length() && isS2First) {
            return result2;
        }
        if (isS1First) {
            strings.add(result1);
        }
        if (isS2First) {
            strings.add(result2);
        }
        Collections.sort(strings);
        System.out.println(strings);
        return strings.get(0);
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.solution("AxAxAky", "AkyAxyAxA"));
    }
}
