package BackJoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 비밀번호 발음하기
// 실버 5
// 20분 소요.
public class BackJoon4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.next();
            if ("end".equals(word)) {
                break;
            }
            if (isContain(word) && isNotOverlap(word) && isNotDoubleWord(word)) {
                System.out.println("<" + word + "> is acceptable.");
                continue;
            }
            System.out.println("<" + word + "> is not acceptable.");
        }
    }

    private static boolean isContain(String word) {
        String[] aeiou = new String[]{"a", "e", "i", "o", "u"};
        for (String s : aeiou) {
            if (word.contains(s)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNotOverlap(String word) {
        List<String> aeiou = Arrays.asList("a", "e", "i", "o", "u");
        for (int i = 0; i < word.length() - 2; i++) {
            int countMoeum = (int) Arrays.stream(word.substring(i, i + 3).split(""))
                    .filter(w -> aeiou.contains(w))
                    .count();
            int countJaeum = (int) Arrays.stream(word.substring(i, i + 3).split(""))
                    .filter(w -> !aeiou.contains(w))
                    .count();
            if (countMoeum == 3 || countJaeum == 3) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotDoubleWord(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            String first = word.substring(i, i + 2).split("")[0];
            String second = word.substring(i, i + 2).split("")[1];
            if ("ee".equals(first.concat(second)) || "oo".equals(first.concat(second))) {
                return true;
            }
            if (first.equals(second)) {
                return false;
            }
        }
        return true;
    }
}
