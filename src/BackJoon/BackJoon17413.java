package BackJoon;

import java.util.Scanner;

// 단어 뒤집기2
// 실버 3
// 13시 40분 시작. 14시 40분 완료.
public class BackJoon17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean isTag = false;
        int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c == ' ') {
                sb.append(' ');
                index++;
                continue;
            }
            if (c == '<') {
                isTag = true;
                sb.append('<');
                index++;
                continue;
            }
            if (c == '>') {
                isTag = false;
                sb.append('>');
                index++;
                continue;
            }
            if (isTag) {
                sb.append(c);
                index++;
                continue;
            }
            word.append(c);
            if (index < s.length() - 1 && (s.charAt(index + 1) == '<' || s.charAt(index + 1) == ' ')) {
                sb.append(word.reverse().toString());
                word.setLength(0);
            }
            if (index == s.length() - 1) {
                sb.append(word.reverse().toString());
            }
            index++;
        }
        System.out.println(sb.toString());
    }
}
