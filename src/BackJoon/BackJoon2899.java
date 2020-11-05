package BackJoon;

import java.util.Scanner;

// 설탕 배달
// 브론즈 1
public class BackJoon2899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n % 5 != 0) {
            n = n - 3;
            count++;
            if (n < 0) {
                System.out.println(-1);
                return;
            }
        }
        count += n / 5;
        System.out.println(count);
    }
}

