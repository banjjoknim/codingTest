package w1Stream;

// 03시 16분 시작 03시 28분 완료.
public class Q3 {
    public String solution(String word) {
        String answer = "";
        char[] charArray = new char[26];
        char[] charArrayReverse = new char[26];
        for (int i = 0; i < 26; i++) {
            charArray[i] = (char)('a' + i);
            charArrayReverse[i] = (char)('z' - i);
        }
        for (int i = 0; i < word.split("").length; i++) {
            for (int j = 0; j < 26; j++) {
                if (Character.toLowerCase(word.charAt(i)) == charArray[j]) {
                    if ((word.charAt(i) < 'Z')) {
                        answer += String.valueOf(Character.toUpperCase(charArrayReverse[j]));
                        break;
                    }
                    answer += String.valueOf(charArrayReverse[j]);
                }
            }
            if (word.split("")[i].equals(" ")) {
                answer += " ";
            }
        }
        return answer;
    }
}
