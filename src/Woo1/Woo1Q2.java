package Woo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 37분 걸림.
public class Woo1Q2 {
    public boolean solution(int[][] lands, int[][] wells, int[] point) {
        boolean aboutLands = Arrays.stream(lands)
                .allMatch(land -> isNotOverlap(land, point));
        boolean aboutWells = Arrays.stream(wells)
                .anyMatch(well -> !isNotOverlap(well, point));

        if (aboutLands && aboutWells) {
            return true;
        }
        return false;
    }

    private static boolean isNotOverlap(int[] position, int[] point) {
        List<Integer> positionX = IntStream.range(0, position.length)
                .filter(index -> index != 1 && index != 3)
                .map(index -> position[index])
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        List<Integer> positionY = IntStream.range(0, position.length)
                .filter(index -> index != 0 && index != 2)
                .map(index -> position[index])
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        List<Integer> pointX = IntStream.range(0, point.length)
                .filter(index -> index != 1 && index != 3)
                .map(index -> point[index])
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        List<Integer> pointY = IntStream.range(0, point.length)
                .filter(index -> index != 0 && index != 2)
                .map(index -> point[index])
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return (positionX.get(1) <= pointX.get(0) || pointX.get(1) <= positionX.get(0)) ||
                ((positionY.get(1) <= pointY.get(0) || pointY.get(1) <= positionY.get(0)));
    }

    public static void main(String[] args) {
        Woo1Q2 woo1Q2 = new Woo1Q2();
        int[][] lands = {{10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40}};
        int[][] wells = {{15, 15, 25, 25}, {40, 10, 50, 20}};
        int[] point = {10, 10, 30, 30};
        // int[][] lands = {{0, 0, 20, 10}, {10, 20, 20, 40}, {30, 0, 50, 20}};
        // int[][] wells = {{20, 40, 30, 50}, {30, 20, 50, 30}};
        // int[] point = {20, 30, 30, 40};
        System.out.println(woo1Q2.solution(lands, wells, point));
    }
}
