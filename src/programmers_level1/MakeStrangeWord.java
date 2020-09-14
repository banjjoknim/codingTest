package programmers_level1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 이상한 문자 만들기
// 15시 42분 시작. 16시 06분 완료.
public class MakeStrangeWord {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split("");
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (words[i].equals(" ")) {
                index = 0;
                continue;
            }
            if (index % 2 == 0) {
                words[i] = words[i].toUpperCase();
            } else {
                words[i] = words[i].toLowerCase();
            }
            index += 1;
        }
        return Arrays.stream(words)
                .collect(Collectors.joining());
//        for (String word : words) {
//            answer += word;
//        }
//        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        MakeStrangeWord makeStrangeWord = new MakeStrangeWord();
        System.out.println(makeStrangeWord.solution(s));
    }
}
