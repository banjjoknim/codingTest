package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

// 더하기 사이클
public class BackJoon1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int count = 0;
        while (true) {
            count++;
            int sum = Arrays.stream(sb.toString().split(""))
                    .mapToInt(Integer::valueOf)
                    .sum();
            char pre = sb.charAt(sb.length() - 1);
            String sumStr = String.valueOf(sum);
            char next = sumStr.charAt(sumStr.length() - 1);
            sb.setLength(0);
            sb.append(pre);
            sb.append(next);
            if (Integer.valueOf(sb.toString()) == n) {
                break;
            }
        }
        System.out.println(count);
    }

}
