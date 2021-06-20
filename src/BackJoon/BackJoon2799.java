package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

// 블라인드
// 실버 4
// 1시간 넘게 걸림.
public class BackJoon2799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        String[][] windows = new String[5 * m + 1][];
        for (int i = 0; i < 5 * m + 1; i++) {
            String[] info = sc.next().split("");
            windows[i] = info;
        }
        int[] answer = new int[5];
        for (int i = 1; i < windows.length - 4; i++) {
            for (int j = 0; j < windows[i].length; j++) {
                if (windows[i][j].equals("*") || windows[i][j].equals(".")) {
                    int count = 0;
                    for (int k = i; k < i + 4; k++) {
                        if (windows[k][j].equals("*")) {
                            count++;
                        }
                    }
                    answer[count]++;
                    j = j + 3;
                }
            }
            i = i + 4;
        }
        Arrays.stream(answer)
                .forEach(num -> System.out.print(num + " "));
    }
}
