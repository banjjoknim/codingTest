package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 밀비 급일!
public class BackJoon11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = br.readLine();
            if ("END".equals(text)) {
                 break;
            }
            StringBuilder sb = new StringBuilder(text);
            sb.reverse();
            System.out.println(sb.toString());
        }

    }
}
