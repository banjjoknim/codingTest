package BackJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 카드 역배치
// 브론즈 2
// 12시 시작 12시 10분 완료.
public class BackJoon10804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put((char) ('A' + i), i + 1);
        }

        String cards = "";
        for (int i = 0; i < 20; i++) {
            cards += (char) ('A' + i);
        }

        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt();
            cards = reverseCard(cards, start, end);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            answer.append(map.get(cards.charAt(i)) + " ");
        }

        System.out.println(answer.toString());
    }

    static String reverseCard(String cards, int start, int end) {
        StringBuilder sb = new StringBuilder(cards.substring(start, end));
        sb.reverse();
        return cards.replace(cards.substring(start, end), sb.toString());
    }
}
