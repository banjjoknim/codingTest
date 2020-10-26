package BackJoon;

import java.util.Scanner;

// 뒤집힌 덧셈
public class BackJoon1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        StringBuilder sbx = new StringBuilder(x);
        StringBuilder sby = new StringBuilder(y);
        sbx.reverse();
        sby.reverse();
        int sum = Integer.valueOf(sbx.toString()) + Integer.valueOf(sby.toString());

        StringBuilder sbSum = new StringBuilder(String.valueOf(sum));
        sbSum.reverse();
        System.out.println(Integer.valueOf(sbSum.toString()));
    }
}
