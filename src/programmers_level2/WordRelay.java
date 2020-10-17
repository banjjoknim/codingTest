package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 영어 끝말잇기
// 22시 53분 시작. 23시 25분 완료.
public class WordRelay {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int size = 0;
        int[] numbers = new int[n];
        numbers[0] = n;
        for (int i = 1; i < n; i++) {
            numbers[i] = i;
        }

        List<String> list = new ArrayList<>();
        while (size < words.length) {
            String nowWord = words[size];
            if (!list.isEmpty()) {
                String lastWord = list.get(list.size() - 1);
                if (lastWord.charAt(lastWord.length() - 1) != nowWord.charAt(0)) {
                    break;
                }
            }
            if (!list.contains(nowWord)) {
                list.add(nowWord);
                size++;
                continue;
            }
            break;
        }
        if (size == words.length) {
            return new int[] {0, 0};
        }
        answer[0] = numbers[(size + 1) % n];
        answer[1] = (int) Math.ceil((size + 1) / (double) n);
        return answer;
    }

    public static void main(String[] args) {
        WordRelay wordRelay = new WordRelay();
        int n = 3;
        int n2 = 2;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(wordRelay.solution(n, words)));
        System.out.println(Arrays.toString(wordRelay.solution(n2, words2)));
    }
}
