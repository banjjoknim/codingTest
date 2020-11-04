package BackJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 비슷한 단어
// 실버 4
// 삽질 오지게 했다. 2시간 걸린듯??
// 접근방법 참조후 10분정도 소요.
public class BackJoon2607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int answer = 0;

        Map<Character, Integer> original = new HashMap<>();
        Map<Character, Integer> other = new HashMap<>();
        String word = sc.next();

        fill(original);
        for (char c : word.toCharArray()) {
            original.replace(c, original.get(c) + 1);
        }

        for (int i = 0; i < count - 1; i++) {
            fill(other);
            String compareWord = sc.next();
            for (char c : compareWord.toCharArray()) {
                other.replace(c, other.get(c) + 1);
            }

            if (Math.abs(original.values().stream().mapToInt(Integer::intValue).sum() -
                other.values().stream().mapToInt(Integer::intValue).sum()) == 1) {
                int diff = 0;
                for (char c = 'A'; c <= 'Z'; c++) {
                    diff += Math.abs(original.get(c) - other.get(c));
                }
                if (diff == 1) {
                    answer++;
                }
            }
            if (original.values().stream().mapToInt(Integer::intValue).sum() == other.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum()) {
                int diff = 0;
                for (char c = 'A'; c <= 'Z'; c++) {
                    diff += Math.abs(original.get(c) - other.get(c));
                }
                if (diff == 2 || diff == 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    private static void fill(Map<Character, Integer> map) {
        for (char c = 'A'; c <= 'Z'; c++) {
            map.put(c, 0);
        }
    }
}
