package BackJoon;

import java.util.Scanner;

// 로봇 청소기
// 18시 30분 시작. 20시 30분 완료.
public class backJoon14503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int positionY = sc.nextInt();
        int positionX = sc.nextInt();
        int direction = sc.nextInt();
        int[] position = new int[] {positionX, positionY};
        RobotCleaner robotCleaner = new RobotCleaner(position, direction);

        int[][] space = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                space[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        if (space[positionY][positionX] == 0) {
            space[positionY][positionX] = -1;
            count++;
        }
        int tryNumber = 0;

        while (true) {
            if (tryNumber == 4 && robotCleaner.checkBackIsWall(space)) {
                break;
            }
            if (tryNumber == 4) {
                robotCleaner.moveBack();
                tryNumber = 0;
            }
            if (robotCleaner.checkLeftSideIsWall(space)) {
                robotCleaner.changeDirection();
                tryNumber++;
                continue;
            }
            if (robotCleaner.checkLeftSideIsDirty(space)) {
                robotCleaner.changeDirection();
                robotCleaner.move();
                robotCleaner.clean(space);
                count++;
                tryNumber = 0;
                continue;
            }
            robotCleaner.changeDirection();
            tryNumber++;
        }

        System.out.println(count);
    }

    static class RobotCleaner {
        private static final int NORTH = 0;
        private static final int EAST = 1;
        private static final int SOUTH = 2;
        private static final int WEST = 3;

        private int currentDirection;
        private int[] position;

        public RobotCleaner(int[] position, int currentDirection) {
            this.currentDirection = currentDirection;
            this.position = position;
        }

        private void clean(int[][] space) {
            int location = space[this.position[1]][this.position[0]];
            if (location == 0) {
                space[this.position[1]][this.position[0]] = -1;
            }
        }

        private boolean checkBackIsWall(int[][] space) {
            if (currentDirection == NORTH) {
                return space[position[1] + 1][position[0]] == 1;
            }
            if (currentDirection == EAST) {
                return space[position[1]][position[0] - 1] == 1;
            }
            if (currentDirection == SOUTH) {
                return space[position[1] - 1][position[0]] == 1;
            }
            // if (currentDirection == WEST) {
            return space[position[1]][position[0] + 1] == 1;
            // }
        }

        private boolean checkLeftSideIsWall(int[][] space) {
            if (currentDirection == NORTH) {
                return space[position[1]][position[0] - 1] == 1;
            }
            if (currentDirection == EAST) {
                return space[position[1] - 1][position[0]] == 1;
            }
            if (currentDirection == SOUTH) {
                return space[position[1]][position[0] + 1] == 1;
            }
            // if (currentDirection == WEST) {
            return space[position[1] + 1][position[0]] == 1;
            // }
        }

        private boolean checkLeftSideIsDirty(int[][] space) {
            if (currentDirection == NORTH) {
                return space[position[1]][position[0] - 1] == 0;
            }
            if (currentDirection == EAST) {
                return space[position[1] - 1][position[0]] == 0;
            }
            if (currentDirection == SOUTH) {
                return space[position[1]][position[0] + 1] == 0;
            }
            // if (currentDirection == WEST) {
            return space[position[1] + 1][position[0]] == 0;
            // }
        }

        private void changeDirection() {
            if (currentDirection == NORTH) {
                currentDirection = WEST;
                return;
            }
            if (currentDirection == EAST) {
                currentDirection = NORTH;
                return;
            }
            if (currentDirection == SOUTH) {
                currentDirection = EAST;
                return;
            }
            if (currentDirection == WEST) {
                currentDirection = SOUTH;
                return;
            }
        }

        private void move() {
            if (currentDirection == NORTH) {
                position[1] = position[1] - 1;
            }
            if (currentDirection == EAST) {
                position[0] = position[0] + 1;
            }
            if (currentDirection == SOUTH) {
                position[1] = position[1] + 1;
            }
            if (currentDirection == WEST) {
                position[0] = position[0] - 1;
            }
        }

        private void moveBack() {
            if (currentDirection == NORTH) {
                position[1] = position[1] + 1;
            }
            if (currentDirection == EAST) {
                position[0] = position[0] - 1;
            }
            if (currentDirection == SOUTH) {
                position[1] = position[1] - 1;
            }
            if (currentDirection == WEST) {
                position[0] = position[0] + 1;
            }
        }
    }
}
