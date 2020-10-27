package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

// 빙고
// 실버 5
// 11시 14분 시작 11시 40분 완료.
public class BackJoon2578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[5][5];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < 25; i++) {
            int bingo = 0;
            int checkNumber = sc.nextInt();
            check(numbers, checkNumber);
            count++;

            for (int j = 0; j < 5; j++) {
                if (checkRow(numbers, j)) {
                    bingo++;
                }
                if (checkCol(numbers, j)) {
                    bingo++;
                }
                if (bingo >= 3) {
                    System.out.println(count);
                    return;
                }
            }
            if (checkDownDiagonal(numbers)) {
                bingo++;
            }
            if (checkUpDiagonal(numbers)) {
                bingo++;
            }
            if (bingo >= 3) {
                System.out.println(count);
                return;
            }
        }
    }

    private static void check(int[][] numbers, int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers[i][j] == number) {
                    numbers[i][j] = -1;
                    return;
                }
            }
        }
    }

    private static boolean checkRow(int[][] numbers, int i) {
        return Arrays.stream(numbers[i])
                .allMatch(number -> number == -1);
    }

    private static boolean checkCol(int[][] numbers, int j) {
        int[] col = new int[5];
        for (int i = 0; i < 5; i++) {
            col[i] = numbers[i][j];
        }
        return Arrays.stream(col)
                .allMatch(number -> number == -1);
    }

    private static boolean checkUpDiagonal(int[][] numbers) {
        int[] diagonal = new int[5];
        for (int i = 0; i < 5; i++) {
            diagonal[i] = numbers[4 - i][i];
        }
        return Arrays.stream(diagonal)
                .allMatch(number -> number == -1);
    }

    private static boolean checkDownDiagonal(int[][] numbers) {
        int[] diagonal = new int[5];
        for (int i = 0; i < 5; i++) {
            diagonal[i] = numbers[i][i];
        }
        return Arrays.stream(diagonal)
                .allMatch(number -> number == -1);
    }

}
