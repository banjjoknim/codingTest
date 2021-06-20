package Woo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 18분 컷
public class Woo1Q4 {
    public int solution(int[] pobi, int[] crong) {

        if (pobi[1] - pobi[0] != 1 || crong[1] - crong[0] != 1) {
            return -1;
        }
        if (Arrays.stream(pobi).sum() % 2 == 0 || Arrays.stream(crong).sum() % 2 == 0) {
            return -1;
        }
        if (Arrays.stream(pobi).anyMatch(page -> 0 > page || page > 400)) {
            return -1;
        }
        if (Arrays.stream(crong).anyMatch(page -> 0 > page || page > 400)) {
            return -1;
        }

        List<Integer> pobiScores = new ArrayList<>();
        List<Integer> crongScores = new ArrayList<>();

        Arrays.stream(pobi)
                .map(Woo1Q4::sumPageNumber)
                .forEach(score -> pobiScores.add(score));
        Arrays.stream(pobi)
                .map(Woo1Q4::multiplePageNumber)
                .forEach(score -> pobiScores.add(score));

        Arrays.stream(crong)
                .map(Woo1Q4::sumPageNumber)
                .forEach(score -> crongScores.add(score));
        Arrays.stream(crong)
                .map(Woo1Q4::multiplePageNumber)
                .forEach(score -> crongScores.add(score));

        int pobiScore = pobiScores.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        int crongScore = crongScores.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        if (pobiScore > crongScore) {
            return 1;
        }
        if (pobiScore < crongScore) {
            return 2;
        }
        return 0;
    }

    private static int sumPageNumber(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    private static int multiplePageNumber(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::valueOf)
                .reduce(1, (x, y) -> x * y);
    }

    public static void main(String[] args) {
        Woo1Q4 woo1Q4 = new Woo1Q4();
        System.out.println(woo1Q4.solution(new int[]{131, 132}, new int[]{211, 212}));
    }
}
