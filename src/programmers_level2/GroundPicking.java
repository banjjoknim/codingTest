package programmers_level2;

import java.util.Arrays;

// 땅따먹기
// 풀이 참조하여 풀었음..
// 동적 프로그래밍(Dynamic Programming)
// 1. i번째 땅에서 인덱스별 값 -> 해당 인덱스의 값 + i-1번째 땅에서의 최댓값
public class GroundPicking {
    int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][1], land[i - 1][0]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][0]);
        }

        return Arrays.stream(land[land.length - 1])
            .max()
            .getAsInt();
    }

    public static void main(String[] args) {
        int[][] land = new int[][] {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        GroundPicking groundPicking = new GroundPicking();
        System.out.println(groundPicking.solution(land));
    }
}
