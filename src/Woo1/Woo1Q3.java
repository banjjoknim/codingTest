package Woo1;

// 4분 컷
public class Woo1Q3 {
    public String solution(String word) {
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append((char) ('z' - c + 'a'));
                continue;
            }
            if (Character.isUpperCase(c)) {
                sb.append((char) ('Z' - c + 'A'));
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Woo1Q3 woo1Q3 = new Woo1Q3();
        System.out.println(woo1Q3.solution("I love you"));
        ;
    }
}
