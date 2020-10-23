package BackJoon;

import java.util.Scanner;

// 다이얼
// 20분정도 걸림..
public class BackJoon5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int time = 0;
        for (char c : s.toCharArray()) {
            int diff = c - 'A';
            if (diff <= 2) {
                time += 3;
                continue;
            }
            if (diff <= 5) {
                time += 4;
                continue;
            }
            if (diff <= 8) {
                time += 5;
                continue;
            }
            if (diff <= 11) {
                time += 6;
                continue;
            }
            if (diff <= 14) {
                time += 7;
                continue;
            }
            if (diff <= 18) {
                time += 8;
                continue;
            }
            if (diff <= 21) {
                time += 9;
                continue;
            }
            if (diff <= 25) {
                time += 10;
                continue;
            }

        }
        System.out.println(time);
    }

}
