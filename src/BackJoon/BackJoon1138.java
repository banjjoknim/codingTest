package BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 한 줄로 서기
// 실버 2
// 10시 25분 시작 10시 34분 완료.
public class BackJoon1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tall = new int[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tall[i] = sc.nextInt();
        }

        for (int i = n; i >= 1; i--) {
            list.add(tall[i - 1], i);
        }

        for (int number : list) {
            System.out.print(number + " ");
        }

    }
}
