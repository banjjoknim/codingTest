package BackJoon;

import java.util.Scanner;

// 열 개씩 끊어 출력하기
// 브론즈 2
// 5분컷?
public class BackJoon11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < word.length()) {
            sb.append(word.charAt(index));
            index++;
            if (index % 10 == 0) {
                System.out.println(sb.toString());
                sb.setLength(0);
                continue;
            }
        }
        System.out.println(sb.toString());
    }
}
