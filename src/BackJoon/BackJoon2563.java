package BackJoon;

import java.util.*;

// 색종이
// 09시 44분 시작. 11시 완료. 풀이 참조하였음. 좌표를 세는 방법이용.
public class BackJoon2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(100);
            return;
        }

        boolean[][] papers = new boolean[100][100];
        checkPaper(sc, n, papers);
        System.out.println(getAnswer(papers));
    }

    private static void checkPaper(Scanner sc, int n, boolean[][] papers) {
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    papers[j][k] = true;
                }
            }
        }
    }

    private static int getAnswer(boolean[][] papers) {
        int answer = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (papers[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
