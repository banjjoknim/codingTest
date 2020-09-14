package programmers_level1;

import java.util.ArrayList;
import java.util.List;

// 크레인 인형뽑기 게임
// 16시 15분 시작. 16시 39분 완료.
public class CraneGame {
    public int solution(int[][] board, int[] moves) {

        List<Integer> gettedDolls = getDoll(board, moves);

        return getAnswer(gettedDolls);
    }

    private int getAnswer(List<Integer> gettedDolls) {
        int count = 0;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < gettedDolls.size() - 1; i++) {
                if (gettedDolls.get(i) == gettedDolls.get(i + 1)) {
                    gettedDolls.remove(i + 1);
                    gettedDolls.remove(i);
                    count += 2;
                    check = true;
                    break;
                }
            }
        }
        return count;
    }

    private List getDoll(int[][] board, int[] moves) {
        List<Integer> gettedDolls = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                int y = j;
                if (board[y][x] != 0) {
                    gettedDolls.add(board[y][x]);
                    board[y][x] = 0;
                    break;
                }
            }
        }
        return gettedDolls;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        CraneGame craneGame = new CraneGame();
        System.out.println(craneGame.solution(board, moves));
    }
}
