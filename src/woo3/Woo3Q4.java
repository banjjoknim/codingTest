package woo3;

// 못 품.. n - Math.min()을 생각 못했음..
public class Woo3Q4 {
    private static int count;

    public int solution(int n, int[][] board) {

        int now = 0;
        while (now < Math.pow(n, 2)) {
            int nowX = 0;
            int nowY = 0;
            int nextX = 0;
            int nextY = 0;
            int finalX = 0;
            int finalY = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == now) {
                        nowX = j;
                        nowY = i;
                    }
                    if (board[i][j] == now + 1) {
                        nextX = j;
                        nextY = i;
                    }
                }
                finalX = Math.min(Math.abs(nowX - nextX), n - Math.abs(nowX - nextX));
                finalY = Math.min(Math.abs(nowY - nextY), n - Math.abs(nowY - nextY));
            }
            int inputCount = finalX + finalY + 1;
            count += inputCount;
            now++;
        }
        return count;
    }

    public static void main(String[] args) {
        Woo3Q4 woo3Q4 = new Woo3Q4();
        int n = 4;
        int[][] board = {{11, 9, 8, 12}, {2, 15, 4, 14}, {1, 10, 16, 3}, {13, 7, 5, 6}};
        System.out.println(woo3Q4.solution(n, board));
    }
}
