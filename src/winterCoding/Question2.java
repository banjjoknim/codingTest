package winterCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2020 윈터코딩 2번 문제
// 100점.
// 40분 소요
public class Question2 {
    public String solution(String encrypted_text, String key, int rotation) {
        String restoredWord = rotationBack(encrypted_text, rotation);
        return restore(restoredWord, key);
    }

    private String restore(String encrypted_text, String key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encrypted_text.length(); i++) {
            if (encrypted_text.charAt(i) - key.charAt(i) < 0) {
                sb.append((char) ('z' + encrypted_text.charAt(i) - key.charAt(i)));
                continue;
            }
            sb.append((char) (encrypted_text.charAt(i) - (key.charAt(i) - 'a' + 1)));
        }
        return sb.toString();
    }

    private String rotationBack(String encrypted_text, int rotation) {
        List<String> keyStr = Arrays.stream(encrypted_text.split(""))
            .collect(Collectors.toList());
        if (rotation > 0) {
            for (int i = 0; i < Math.abs(rotation); i++) {
                keyStr.add(keyStr.remove(0));
            }
        }
        if (rotation < 0) {
            for (int i = 0; i < Math.abs(rotation); i++) {
                keyStr.add(0, keyStr.remove(keyStr.size() - 1));
            }
        }
        return keyStr.stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "qyyigoptvfb";
        int rotation = 3;
        Question2 question2 = new Question2();
        System.out.println(question2.solution(s, "abcdefghijk", rotation));
    }
}
