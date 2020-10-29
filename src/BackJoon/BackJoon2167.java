package BackJoon;

import java.util.Scanner;

// 2차원 배열의 합
// 브론즈 1
// 10시 50분 시작 11시 50분 완료
public class BackJoon2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                numbers[k][l] = sc.nextInt();
            }
        }
        int k = sc.nextInt();


        for (int i = 0; i < k; i++) {
            int startY = sc.nextInt() - 1;
            int startX = sc.nextInt() - 1;
            int endY = sc.nextInt() - 1;
            int endX = sc.nextInt() - 1;
            int sum = 0;
            int nowX = startX;
            int nowY = startY;
            while (true) {
                if (startX <= nowX && nowX <= endX && startY <= nowY && nowY <= endY) {
                    sum += numbers[nowY][nowX];
                    nowY++;
                }
                if (nowY > endY) {
                    nowY = startY;
                    nowX++;
                }
                if (nowX > endX) {
                    System.out.println(sum);
                    break;
                }
            }
        }

    }
}
