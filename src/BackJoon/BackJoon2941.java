package BackJoon;

import java.util.Scanner;

// 크로아티아 알파벳
// 14시 36분 시작 14시 40분 완료.
public class BackJoon2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = changeWord(sc.next());
        System.out.println(s.length());
    }

    private static String changeWord(String s) {
        s = s.replaceAll("c=", "C");
        s = s.replaceAll("c-", "D");
        s = s.replaceAll("dz=", "E");
        s = s.replaceAll("d-", "F");
        s = s.replaceAll("lj", "G");
        s = s.replaceAll("nj", "H");
        s = s.replaceAll("s=", "I");
        s = s.replaceAll("z=", "L");

        return s;
    }
}
