package BackJoon;

import java.util.Scanner;

// 분수찾기
// 16시 5분 시작. 16시 38분 완료.
public class BackJoon1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index = 0;
        while (x > 0) {
            x = x - index;
            index++;
        }
        x = x + index - 1;
        if (index % 2 == 0) {
            System.out.println(index - x + "/" + x);
            return;
        }
        System.out.println(x + "/" + (index - x));
    }
}
