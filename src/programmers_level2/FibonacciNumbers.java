package programmers_level2;

import java.util.ArrayList;
import java.util.List;

// 피보나치 수
// 14시 36분 시작. 15시 42분 완료. (A+B) % C == ((A%C)+(B%C)) % C 와 같다!
public class FibonacciNumbers {
    public long solution(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        while (true) {
            numbers.add(numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2));
            if (numbers.size() - 1 == n) {
                return numbers.get(n);
            }
        }
    }

    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.solution(5));
    }
}
