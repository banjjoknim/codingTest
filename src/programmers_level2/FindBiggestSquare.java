package programmers_level2;

import java.util.Arrays;
import java.util.stream.IntStream;

// 가장 큰 정사각형 찾기
// 09시 36분 시작. 10시 9분 완료. 풀이 참조하여 풀었음. 이전에 걸린시간 1시간 40분정도. 총 2시간정도 걸림.
// DP(Dynamic Programming)으로 풀었음. 큰 문제를 작은 문제로 나누어 푸는 알고리즘.
public class FindBiggestSquare {
    public int solution(int[][] board) {
        int[][] newBoard = new int[board.length + 1][board[0].length + 1];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newBoard[i + 1][j + 1] = board[i][j];
            }
        }

        for (int i = 1; i < newBoard.length; i++) {
            for (int j = 1; j < newBoard[0].length; j++) {
                if (newBoard[i][j] == 1) {
                    newBoard[i][j] = Math.min(newBoard[i - 1][j - 1], Math.min(newBoard[i][j - 1], newBoard[i - 1][j])) + 1;
                }
            }
        }

        int max = Arrays.stream(newBoard)
                .flatMapToInt(
                        array -> IntStream.range(1, array.length)
                                .map(index -> array[index]))
                .max()
                .getAsInt();

        return (int) Math.pow(max, 2);
    }

    public static void main(String[] args) {
//        int[][] board = new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}};
        int[][] board = new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        FindBiggestSquare findBiggestSquare = new FindBiggestSquare();
        System.out.println(findBiggestSquare.solution(board));
    }

//    public int solution(int[][] board) {
//        int answer = 0;
//        int[][] newBoard = new int[board.length + 1][board[0].length + 1];
//        // 새로운 배열 생성
//        for (int i = 0; i < board.length; i++)
//            for (int j = 0; j < board[i].length; j++)
//                newBoard[i + 1][j + 1] = board[i][j];
//
//        int max = 0;
//
//        // 만들 수 있는 정사각형 검사
//        for (int i = 1; i < newBoard.length; i++) {
//            for (int j = 1; j < newBoard[i].length; j++) {
//                /* 2x2 사각형의 우측하단 꼭짓점을 기준으로 정사각형이 되는지 체크한다.
//                 * 현재 값이 1인경우 좌←, 상↑, 좌상↖ 체크
//                 * ←, ↑, ↖ 값이 모두 1인경우 정사각형을 만들 수 있음
//                 */
//                if (newBoard[i][j] == 1) {
//                    int left = newBoard[i - 1][j];    // 좌측 값
//                    int up = newBoard[i][j - 1];      // 상단 값
//                    int leftUp = newBoard[i - 1][j - 1];// 좌측상단(대각선) 값
//                    int min = Math.min(left, Math.min(up, leftUp));
//                    newBoard[i][j] = min + 1;
//                    max = Math.max(max, min + 1);
//                }
//            }
//        }
//        answer = max * max;
//        return answer;
//    }
}
