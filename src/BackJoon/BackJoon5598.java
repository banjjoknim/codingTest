package BackJoon;

import java.util.Scanner;

// 카이사르 암호
// 브론즈 2
// 10시 5분 시작 10시 19분 완료.
public class BackJoon5598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'C') {
                sb.append((char)(s.charAt(i)+'Z'-'A'-2));
                continue;
            }
            sb.append((char) (s.charAt(i) - 3));
        }

        System.out.println(sb.toString());

    }
}
