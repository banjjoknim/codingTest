package slab;

import java.util.ArrayList;
import java.util.List;

class Solution3 {

    private static class PrimeNumberFinder {
        public List<Integer> find(int N) {
            List<Integer> numbers = new ArrayList<>();
            for (int number = 2; number <= N; number++) {
                if (isPrime(number)) {
                    numbers.add(number);
                }
            }
//            System.out.println(numbers);
            return numbers;
        }

        private boolean isPrime(int number) {
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0 && number != j) {
                    return false;
                }
            }
            return true;
        }
    }

    void getChe(int N) {
        int[] arr = new int[N + 1];

        // 입력받은 수 만큼 배열에 모두 초기화 해둔다
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (arr[i] == 0) { // 이미 체크된 수의 배수는 확인하지 않는다
                continue;
            }
            for (int j = i + i; j <= N; j += i) { // i를 제외한 i의 배수들은 0으로 체크
                arr[j] = 0;
            }
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (arr[i] != 0) {
                numbers.add(i);
            }
        }
//        System.out.println(numbers);
    }

    private static class Counter {
        private static int count = 0;

        private int count(List<Integer> numbers, int N, int M) {
            while (!numbers.isEmpty()) {
                int sum = 0;
                for (int number : numbers) {
                    sum = sum + number;
                    if (sum < M) {
                        continue;
                    }
                    if (sum == M) {
                        count++;
                    }
                    break;
                }
                numbers.remove(0);
            }
            return count;
        }
    }

    public int solution(int N, int M) {
        Counter counter = new Counter();
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        List<Integer> numbers = primeNumberFinder.find(N);
        return counter.count(numbers, N, M);
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int N = 5000000;
        int M = 83;
        long start = System.currentTimeMillis();
        System.out.println(solution.solution(N, M));
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

        start = System.currentTimeMillis();
        solution.getChe(N);
        end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }
}
