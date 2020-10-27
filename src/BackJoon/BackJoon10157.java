package BackJoon;

import java.util.Scanner;

// 자리배정
// 실버 5
// 16시 44분 시작 17시 19분 완료.
public class BackJoon10157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int total = r * c;
        int x = 1;
        int y = 1;
        int move = 1;
        boolean top = true;
        boolean bottom = false;
        boolean left = false;
        boolean right = false;
        int count = 1;
        if (k > total) {
            System.out.println(0);
            return;
        }
        while (count <= total) {
            if (count == k) {
                System.out.println(x + " " + y);
                return;
            }
            count++;
            if (top) {
                y++;
                move++;
                if (move == r) {
                    top = false;
                    right = true;
                    c--;
                    move = 0;
                }
                continue;
            }
            if (right) {
                x++;
                move++;
                if (move == c) {
                    right = false;
                    bottom = true;
                    r--;
                    move = 0;
                }
                continue;
            }
            if (bottom) {
                y--;
                move++;
                if (move == r) {
                    bottom = false;
                    left = true;
                    c--;
                    move = 0;
                }
                continue;
            }
            if (left) {
                x--;
                move++;
                if (move == c) {
                    left = false;
                    top = true;
                    r--;
                    move = 0;
                }
                continue;
            }
        }
    }
}
