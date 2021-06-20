package BackJoon;

import java.util.Scanner;

// 설탕 배달
// 15시 17분 시작. 15시 37분 완료.
public class BackJoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // 3씩 배달하는 최소 갯수를 구한다.
        while (n % 5 != 0) {
            n = n - 3;
            count++;
            // 끝까지 멈추지 않으면 딱 맞게 배달불가능
            if (n < 0) {
                System.out.println(-1);
                return;
            }
        }
        count += n / 5;
        System.out.println(count);
    }
}
