package w1Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// 01시 02분 시작 01시 45분 완료. (순수 문제 푸는 시간)
public class Q2 {
    public boolean solution(int[][] lands, int[][] wells, int[] point) {
        boolean answer;
        List<Integer> pointX = new ArrayList<Integer>();
        List<Integer> pointY = new ArrayList<Integer>();
        addToList(point, pointX, pointY);

        boolean landCheck = IntStream.range(0, lands.length).allMatch(index -> landCheck(lands[index], pointX, pointY));
        boolean wellCheck = IntStream.range(0, wells.length).allMatch(index -> wellCheck(wells[index], pointX, pointY));

        if (landCheck && wellCheck) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    private void addToList(int[] location, List<Integer> listX, List<Integer> listY) {

        IntStream.range(0, 4).filter(index -> index % 2 == 0).forEach(index -> listX.add(location[index]));
        IntStream.range(0, 4).filter(index -> index % 2 != 0).forEach(index -> listY.add(location[index]));
        Collections.sort(listX);
        Collections.sort(listY);
    }

    boolean landCheck(int[] land, List<Integer> pointX, List<Integer> pointY) {

        List<Integer> landX = new ArrayList<>();
        List<Integer> landY = new ArrayList<>();
        addToList(land, landX, landY);
        boolean xAxisCheckOnLand = pointX.get(1) <= landX.get(0) || pointX.get(0) >= landX.get(1);
        boolean yAxisCheckOnLand = pointY.get(1) <= landY.get(0) || pointY.get(0) >= landY.get(1);
        if (xAxisCheckOnLand || yAxisCheckOnLand) {
            return true;
        }
        return false;
    }

    boolean wellCheck(int[] well, List<Integer> pointX, List<Integer> pointY) {

        List<Integer> wellX = new ArrayList<>();
        List<Integer> wellY = new ArrayList<>();
        addToList(well, wellX, wellY);
        boolean xAxisCheckOnWell = pointX.get(0) <= wellX.get(0) && wellX.get(1) <= pointX.get(1);
        boolean yAxisCheckOnWell = pointY.get(0) <= wellY.get(0) && wellY.get(1) <= pointY.get(1);
        if (xAxisCheckOnWell || yAxisCheckOnWell) {
            return true;
        }
        return false;
    }
}
