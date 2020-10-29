package BackJoon;

import java.util.Scanner;

// FBI
// 브론즈 2
// 3분 컷
public class BackJoon2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exist = false;
        for (int i = 0; i < 5; i++) {
            if (sc.next().contains("FBI")) {
                exist = true;
                System.out.print(i + 1+" ");
            }
        }
        if (!exist) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
