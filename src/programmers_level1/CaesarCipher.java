package programmers_level1;

// 시저 암호
// 00시 38분 시작. 01시 20분 완료.
public class CaesarCipher {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) ((chars[i] - 'A' + n) % 26 + 'A');
            }
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) ((chars[i] - 'a' + n) % 26 + 'a');
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.solution("yzYZ", 5));
    }
}
