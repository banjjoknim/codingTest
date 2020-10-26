package BackJoon;

import java.util.Scanner;

// 팰린드롬인지 확인하기
public class BackJoon10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
