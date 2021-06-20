package BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 제로
// 20시 35분 시작. 20시 47분 완료.
public class backJoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int number = sc.nextInt();
            if (number != 0) {
                numbers.add(number);
            }
            if (number == 0) {
                numbers.remove(numbers.size() - 1);
            }
        }
        System.out.println(numbers.stream()
                .mapToInt(number -> number)
                .sum());
    }
}
