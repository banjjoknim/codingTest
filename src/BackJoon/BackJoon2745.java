package BackJoon;

import java.util.Scanner;

// 진법 변환
public class BackJoon2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long b = sc.nextInt();

        long number = 0;
        for (int i = 0; i < n.length(); i++) {
            char multiple = n.charAt(i);
            double pow = Math.pow(b, n.length() - i - 1);
            if ('A' <= multiple && multiple <= 'Z') {
                number += pow * (multiple - 'A' + 10);
                continue;
            }
            int multipleNumber = Integer.valueOf(String.valueOf(n.charAt(i)));
            number += pow * multipleNumber;
        }

        System.out.println(number);
    }
}

