package BackJoon;

import java.util.Scanner;

// 달팽이
// 실버 5
// 10시 38분 시작. 50분 중지
public class BackJoon1913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] numbers = new int[n][];
        for (int i = 1; i <= Math.pow(n,2); i++) {
            numbers[(n/2)+i-1][(n/2)+i-1] = i;
        }

    }
}
