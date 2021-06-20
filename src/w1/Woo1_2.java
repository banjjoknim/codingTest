package w1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Woo1_2 {
    // 12시 48분 시작. 02시 00분 완료
    int[][] lands;
    int[][] wells;

    public boolean solution(int[] point) {
        boolean result = false;

        // lands = new int[][] {{10, 0, 30, 5}, {0, 30, 20, 50}, {30, 30, 40, 40}};
        // wells = new int[][] {{15, 15, 25, 25}, {40, 10, 50, 20}};
        // point = new int[] {10, 10, 30, 30};

        lands = new int[][]{{0, 0, 20, 10}, {10, 20, 20, 40}, {30, 0, 50, 20}};
        wells = new int[][]{{20, 40, 30, 50}, {30, 20, 50, 30}};
        point = new int[]{20, 30, 30, 40};

        List<Integer> pointX = new ArrayList<Integer>();
        List<Integer> pointY = new ArrayList<Integer>();
        pointX.add(point[0]);
        pointX.add(point[2]);
        pointY.add(point[1]);
        pointY.add(point[3]);
        Collections.sort(pointX);
        Collections.sort(pointY);

        for (int i = 0; i < lands.length; i++) {
            List<Integer> landsX = new ArrayList<Integer>();
            List<Integer> landsY = new ArrayList<Integer>();
            landsX.add(lands[i][0]);
            landsX.add(lands[i][2]);
            landsY.add(lands[i][1]);
            landsY.add(lands[i][3]);
            Collections.sort(landsX);
            Collections.sort(landsY);
            // System.out.println(pointX.get(0) + " " + pointX.get(1));
            // System.out.println(pointY.get(0) + " " + pointY.get(1));
            // System.out.println(landsX.get(0) + " " + landsX.get(1));
            // System.out.println(landsY.get(0) + " " + landsY.get(1));
            if (pointX.get(1) <= landsX.get(0) || pointX.get(0) >= landsX.get(1)) {
                result = true;
            } else {
                if (pointY.get(1) <= landsY.get(0) || pointY.get(0) >= landsY.get(1)) {
                    result = true;
                } else {
                    return false;
                }
            }

            if (pointY.get(1) <= landsY.get(0) || pointY.get(0) >= landsY.get(1)) {
                result = true;
            } else {
                if (pointX.get(1) <= landsX.get(0) || pointX.get(0) >= landsX.get(1)) {
                    result = true;
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < wells.length; i++) {

            List<Integer> wellsX = new ArrayList<Integer>();
            List<Integer> wellsY = new ArrayList<Integer>();
            wellsX.add(wells[i][0]);
            wellsX.add(wells[i][2]);
            wellsY.add(wells[i][1]);
            wellsY.add(wells[i][3]);

            Collections.sort(wellsX);
            Collections.sort(wellsY);

            if (pointX.get(1) <= wellsX.get(0) || pointX.get(0) >= wellsX.get(1)) {
                if (pointY.get(1) <= wellsY.get(0) || pointY.get(0) >= wellsY.get(1)) {
                    return false;
                } else {
                    result = true;
                }
            }
            if (pointY.get(1) <= wellsY.get(0) || pointY.get(0) >= wellsY.get(1)) {
                if (pointX.get(1) <= wellsX.get(0) || pointX.get(0) >= wellsX.get(1)) {
                    return false;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Woo1_2 woo1_2 = new Woo1_2();
        System.out.println(woo1_2.solution(new int[]{10, 10, 30, 30}));
    }
}
