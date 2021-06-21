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
        int N = 20;
        int M = 36;
        System.out.println(solution.solution(N, M));
    }
}
