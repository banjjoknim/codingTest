package BackJoon;

import java.util.Scanner;

// 팰린드롬수
// 브론즈1
// 10시 20분 시작 10시 24분 완료.
public class BackJoon1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(number));
            String origin = sb.toString();
            sb.reverse();
            String modified = String.valueOf(Integer.valueOf(sb.toString()));
            if (origin.equals(modified)) {
                System.out.println("yes");
                continue;
            }
            System.out.println("no");
        }
    }
}
