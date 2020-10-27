package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

// 개수 세기
// 브론즈 2
// 9시 56분 시작 9시 58분 완료.
public class BackJoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        System.out.println(
                Arrays.stream(numbers)
                        .filter(number -> number == v)
                        .count()
        );
    }
}
