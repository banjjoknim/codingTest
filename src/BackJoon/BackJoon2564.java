package BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 경비원
// 실버 1
// 삽질 40분
// 접근방법 참조후 17분 소요.
public class BackJoon2564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();
        int shopCount = sc.nextInt();
        List<Shop> shops = new ArrayList<>();
        for (int i = 0; i < shopCount; i++) {
            int direction = sc.nextInt();
            int length = sc.nextInt();
            if (direction == 1) {
                shops.add(new Shop(direction, length, height));
                continue;
            }
            if (direction == 2) {
                shops.add(new Shop(direction, length, 0));
                continue;
            }
            if (direction == 3) {
                shops.add(new Shop(direction, 0, height - length));
                continue;
            }
            if (direction == 4) {
                shops.add(new Shop(direction, width, height - length));
                continue;
            }
        }
        int personDirection = sc.nextInt();
        int personLength = sc.nextInt();
        int personX = 0;
        int personY = 0;
        if (personDirection == 1) {
            personY = height;
            personX = personLength;
        }
        if (personDirection == 2) {
            personY = 0;
            personX = personLength;
        }
        if (personDirection == 3) {
            personX = 0;
            personY = height - personLength;
        }
        if (personDirection == 4) {
            personX = width;
            personY = height - personLength;
        }
        int answer = 0;
        for (Shop shop : shops) {
            // 남북으로 마주보는 경우
            if (Math.max(personDirection, shop.direction) == 2 && Math.abs(personDirection - shop.direction) == 1) {
                int leftSideLength = personX + height + shop.x;
                int rightSideLength = width - personX + height + width - shop.x;
                answer += Math.min(leftSideLength, rightSideLength);
                continue;
            }
            // 동서로 마주보는 경우
            if (Math.max(personDirection, shop.direction) == 4 && Math.abs(personDirection - shop.direction) == 1) {
                int upSideLength = width + shop.y + personY;
                int downSideLength = width + height - personY + height - shop.y;
                answer += Math.min(upSideLength, downSideLength);
                continue;
            }
            //그 외 경우
            answer += Math.abs(personX - shop.x) + Math.abs(personY - shop.y);
        }

        System.out.println(answer);
    }

    static class Shop {
        private int direction;
        private int x;
        private int y;

        public Shop(int direction, int x, int y) {
            this.direction = direction;
            this.x = x;
            this.y = y;
        }
    }
}


