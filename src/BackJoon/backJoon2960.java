package BackJoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 에라토스테네스의 체
// 19시 33분 시작. 20시 중지. 20시 50분 재개. 21시 07분 완료.
// 1. N, K 입력.
// 2. 소수여부 체크
// 3. 소수의 배수들 모두 제거하여 set에 입력
// 4. 입력할때마다 count++, 이미 제거된 수는 set 체크하여 그 다음 수 제거
// 5. count == K 일때까지 반복
public class backJoon2960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                for (int j = i; j <= N; j = j + i) {
                    if (!set.contains(j)) {
                        count++;
                        set.add(j);
                    }
                    if (count == K) {
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }

    static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
