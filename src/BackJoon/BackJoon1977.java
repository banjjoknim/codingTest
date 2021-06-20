package BackJoon;

import java.util.Scanner;

public class BackJoon1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = (int) Math.ceil(Math.sqrt(m)); i <= (int) Math.sqrt(n); i++) {
            int number = (int) Math.pow(i, 2);
            sum += number;
            if (number < min) {
                min = number;
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
