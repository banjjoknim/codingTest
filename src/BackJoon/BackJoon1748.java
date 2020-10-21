package BackJoon;

import java.util.Scanner;

// 수 이어 쓰기1
// 11시 29분 시작. 11시 47분. 시간초과가 나서 수정했다.
public class BackJoon1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = 0;

//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            answer += String.valueOf(i).length();
//            sb.append(i);
//        }
//        System.out.println(sb.length());

        for (int i = 1; i <= n; i++) {
            if (i <= 9) {
                answer += 1;
                continue;
            }
            if (i <= 99) {
                answer += 2;
                continue;
            }
            if (i <= 999) {
                answer += 3;
                continue;
            }
            if (i <= 9999) {
                answer += 4;
                continue;
            }
            if (i <= 99999) {
                answer += 5;
                continue;
            }
            if (i <= 999999) {
                answer += 6;
                continue;
            }
            if (i <= 9999999) {
                answer += 7;
                continue;
            }
            if (i <= 99999999) {
                answer += 8;
                continue;
            }
            answer += 9;
        }
        System.out.println(answer);
    }
}
