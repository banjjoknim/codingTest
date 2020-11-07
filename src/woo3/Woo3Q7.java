package woo3;

import java.util.Arrays;

public class Woo3Q7 {
    private static int time = 0;

    public int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        Robot robot = new Robot(0, 0);
        boolean downDigonal = false;
        boolean upDigonal = false;
        boolean moveDown = false;
        boolean moveRight = false;

        while (true) {
            answer[robot.y][robot.x] = time;
            System.out.println("robot.y : " + robot.y);
            System.out.println("robot.x : " + robot.x);
            System.out.println("--------");
            if (robot.x == n - 1 && robot.y == n - 1) {
                break;
            }
            if (horizontal) {
                if (robot.y == n - 1 && !upDigonal) {
                    robot.moveRight();
                    moveRight = false;
                    moveDown = true;
                    upDigonal = true;
                    downDigonal = false;
                    continue;
                }
                if (robot.x == n - 1 && !downDigonal) {
                    robot.moveDown();
                    moveDown = false;
                    moveRight = true;
                    upDigonal = false;
                    downDigonal = true;
                    continue;
                }
                if (!downDigonal && !upDigonal) {
                    robot.moveRight();
                    moveDown = true;
                    downDigonal = true;
                    continue;
                }
                if (robot.x != 0 && downDigonal && !upDigonal) {
                    robot.moveDownDigonal();
                    continue;
                }
                if (robot.x == 0 && moveDown) {
                    robot.moveDown();
                    moveDown = false;
                    moveRight = true;
                    upDigonal = true;
                    downDigonal = false;
                    continue;
                }
                if (robot.y != 0 && upDigonal && !downDigonal) {
                    robot.moveUpDigonal();
                    continue;
                }
                if (robot.y == 0 && moveRight) {
                    robot.moveRight();
                    moveRight = false;
                    moveDown = true;
                    downDigonal = true;
                    upDigonal = false;
                    continue;
                }
            }

            if (robot.y == n - 1 && downDigonal) {
                robot.moveRight();
                downDigonal = false;
                upDigonal = true;
                continue;
            }
            if (robot.y == n - 1 && upDigonal) {
                robot.moveUpDigonal();
                upDigonal = true;
                continue;
            }
            if (!downDigonal && !upDigonal) {
                robot.moveDown();
                upDigonal = true;
                moveDown = false;
                moveRight = true;
                continue;
            }
            if (robot.y != 0 && robot.x == n - 1 && upDigonal) {
                robot.moveDown();
                downDigonal = true;
                upDigonal = false;
                continue;
            }
            if (robot.y != 0 && upDigonal) {
                robot.moveUpDigonal();
                continue;
            }
            if (robot.y == 0 && upDigonal) {
                robot.moveRight();
                upDigonal = false;
                downDigonal = true;
                continue;
            }
            if (robot.x == 0 && downDigonal) {
                robot.moveDown();
                downDigonal = false;
                upDigonal = true;
                continue;
            }
            if (robot.y != 0 && downDigonal) {
                robot.moveDownDigonal();
                continue;
            }
            if (robot.y == 0 && downDigonal) {
                robot.moveDownDigonal();
                continue;
            }

        }

        return answer;
    }

    class Robot {
        private int x;
        private int y;

        public Robot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private void moveRight() {
            this.x++;
            time++;
        }

        private void moveDown() {
            this.y++;
            time++;
        }

        private void moveUpDigonal() {
            this.x++;
            this.y--;
            time += 2;
        }

        private void moveDownDigonal() {
            this.x--;
            this.y++;
            time += 2;
        }
    }

    public static void main(String[] args) {
        Woo3Q7 woo3Q7 = new Woo3Q7();
        int n = 5;
        boolean horizontal = true;
        int[][] answer = woo3Q7.solution(n, horizontal);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
