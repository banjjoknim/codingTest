package w1Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 03시 16분 시작 03시 28분 완료.
public class Q3 {
    public String solution(String word) {
        List<String> answerList = new ArrayList<String>();
        char[] charArray = new char[26];
        char[] charArrayReverse = new char[26];
        IntStream.range(0, 26).forEach(index -> charArray[index] = (char)('a' + index));
        IntStream.range(0, 26).forEach(index -> charArrayReverse[index] = (char)('z' - index));
        for (int i = 0; i < word.split("").length; i++) {
            int nowIndex = i;
            IntStream.range(0, 26)
                .filter(j -> Character.toLowerCase(word.charAt(nowIndex)) == charArray[j])
                .filter(index -> word.charAt(nowIndex) <= 'Z')
                .forEach(j -> answerList.add(nowIndex, String.valueOf(Character.toUpperCase(charArrayReverse[j]))));
            IntStream.range(0, 26)
                .filter(j -> Character.toLowerCase(word.charAt(nowIndex)) == charArray[j])
                .filter(index -> word.charAt(nowIndex) > 'Z')
                .forEach(j -> answerList.add(nowIndex, String.valueOf(charArrayReverse[j])));
            if (word.split("")[i].equals(" ")) {
                answerList.add(nowIndex, " ");
            }
        }
        return answerList.stream().collect(Collectors.joining());
    }
}
