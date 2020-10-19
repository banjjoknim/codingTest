package programmers_level2;

import java.util.Arrays;

// 프렌즈4블록
// 10시 42분 시작. 12시 1분 완료.
// 1. 지워질 수 있는 블록 체크
// 2. 블록 제거 -> 제거시 문자 변경
// 3. 블록 떨이져서 쌓임 반복.
// 4. 더이상 제거할 블록이 없을때까지 1번부터 반복
public class Friends4Block {
    private int count;
    private boolean isExistChange = false;

    public int solution(int m, int n, String[] board) {
        boolean[][] willDelete = new boolean[m][n];

        while (true) {
            //제거될 블록 위치 체크
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (board[i].charAt(j) != '0' && isBlock(i, j, board)) {
                        check(i, j, willDelete);
                    }
                }
            }

            // 블록 제거
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (willDelete[i][j]) {
                        changeBlock(i, j, board);
                    }
                }
            }

            // 블록이 제거된 빈공간을 그 위에 있는 블록으로 메꿈
            while (true) {
                boolean change = false;
                for (int i = 1; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (board[i].charAt(j) == '0' && board[i - 1].charAt(j) != '0') {
                            board[i] = new StringBuilder(board[i]).replace(j, j + 1, String.valueOf(board[i - 1].charAt(j))).toString();
                            board[i - 1] = new StringBuilder(board[i - 1]).replace(j, j + 1, "0").toString();
                            change = true;
                        }
                    }
                }
                if (!change) {
                    break;
                }
            }

            // 블록이 제거되었다면 반복하고 아니면 종료한다.
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (willDelete[i][j] == true) {
                        isExistChange = true;
                        break;
                    }
                }
            }

            if (!isExistChange) {
                break;
            }

            // 블록이 제거되었다면 다시 제거할 블록의 위치를 확인하기 위해 배열을 초기화한다.
            for (int i = 0; i < willDelete.length; i++) {
                Arrays.fill(willDelete[i], false);
                isExistChange = false;
            }

        }
        return count;
    }

    void changeBlock(int i, int j, String[] board) {
        board[i] = new StringBuilder(board[i]).replace(j, j + 1, "0").toString();
        count++;
    }

    boolean isBlock(int i, int j, String[] board) {
        return board[i].charAt(j) == board[i - 1].charAt(j)
                && board[i].charAt(j) == board[i].charAt(j - 1)
                && board[i].charAt(j) == board[i - 1].charAt(j - 1);
    }

    void check(int i, int j, boolean[][] willDelete) {
        willDelete[i][j] = true;
        willDelete[i][j - 1] = true;
        willDelete[i - 1][j] = true;
        willDelete[i - 1][j - 1] = true;
    }

    public static void main(String[] args) {
//        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        String[] board = {"AAAAAA", "BBAATB", "BBAATB", "JJJTAA", "JJJTAA"};
        int m = 5;
        int n = 6;
        Friends4Block friends4Block = new Friends4Block();
        System.out.println(friends4Block.solution(m, n, board));
    }
}
