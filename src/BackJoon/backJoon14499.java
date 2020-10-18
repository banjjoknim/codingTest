package BackJoon;

import java.util.Scanner;

// 주사위 굴리기
// 풀이 참조하여 풀었음. 약간의 순서차이.
public class backJoon14499 {
    static class Dice {
        private int top;
        private int bottom;
        private int west;
        private int east;
        private int south;
        private int north;

        public Dice() {
            this.top = 0;
            this.bottom = 0;
            this.west = 0;
            this.east = 0;
            this.south = 0;
            this.north = 0;
        }

        public void moveEast() {
            int temp = top;
            top = west;
            west = bottom;
            bottom = east;
            east = temp;
        }

        public void moveWest() {
            int temp = top;
            top = east;
            east = bottom;
            bottom = west;
            west = temp;
        }

        public void moveSouth() {
            int temp = top;
            top = north;
            north = bottom;
            bottom = south;
            south = temp;
        }

        public void moveNorth() {
            int temp = top;
            top = south;
            south = bottom;
            bottom = north;
            north = temp;
        }

        public void printTopNumber() {
            System.out.println(top);
        }
    }

    private static int n;
    private static int m;
    private static int x;
    private static int y;
    private static int k;
    private static int[][] map;
    private static int[] dir;
    private static int[] dx = {0, 0, -1, 1};    // 동서북남
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        k = sc.nextInt();
        map = new int[n][m];
        dir = new int[k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            dir[i] = sc.nextInt();
        }

        solution();
    }

    static void solution() {
        Dice dice = new Dice();
        int nx, ny;

        for (int i = 0; i < k; i++) {
            int direction = dir[i] - 1;
            nx = x + dx[direction];
            ny = y + dy[direction];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                // 동쪽은 0, 서쪽은 1, 북쪽은 2, 남쪽은 3
                if (direction == 0) {
                    dice.moveEast();
                }
                if (direction == 1) {
                    dice.moveWest();
                }
                if (direction == 2) {
                    dice.moveNorth();
                }
                if (direction == 3) {
                    dice.moveSouth();
                }

                // 숫자 복사
                if (map[nx][ny] == 0) {
                    map[nx][ny] = dice.bottom;
                } else {
                    dice.bottom = map[nx][ny];
                    map[nx][ny] = 0;
                }

                // 맨 윗면 출력
                dice.printTopNumber();

                x = nx;
                y = ny;
            }
        }
    }
}
