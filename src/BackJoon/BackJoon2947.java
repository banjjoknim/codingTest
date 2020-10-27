package BackJoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

// 나무 조각
// 실버 5
// 15시 8분 시작. 15시 22분 완료.
public class BackJoon2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        while (true) {
            for (int i = 0; i < 4; i++) {
                swap(numbers, i);
                if ("12345".equals(Arrays.stream(numbers)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()))) {
                    return;
                }
            }
        }
    }

    private static void swap(int[] numbers, int i) {
        if (numbers[i] > numbers[i + 1]) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
            Arrays.stream(numbers)
                    .forEach(number -> System.out.print(number + " "));
            System.out.println();
        }
    }
}
