package BackJoon;

import java.util.Scanner;

// 벌집
// 15시 40분 시작 15시 50분 완료.
public class BackJoon2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (n > 1) {
            n = n - 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
