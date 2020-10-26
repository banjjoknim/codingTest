package BackJoon;

import java.util.Scanner;

// 진법 변환2
// 11시 15분 시작 11시 28분 완료.
public class BackJoon11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('A' + i);
        }
        while (n > 0) {
            int temp = n % b;
            n /= b;
            if (temp >= 10) {
                sb.insert(0, chars[temp - 10]);
                continue;
            }
            sb.insert(0, temp);
        }
        System.out.println(sb.toString());
    }
}
