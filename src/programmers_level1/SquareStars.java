package programmers_level1;

import java.util.Scanner;
import java.util.stream.IntStream;

// 22시 24분 시작. 22시 28분 시작.
public class SquareStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            IntStream.range(0, a)
                    .mapToObj(index -> "*")
                    .forEach(System.out::print);
            System.out.println();
        }
    }
}
