package BackJoon;

import java.util.Scanner;
import java.util.Stack;

// 그릇
// 12시 시작 12시 5분 완료.
public class BackJoon7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        int height = 0;
        for (int i = 0; i < s.length(); i++) {
            char bowl = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(bowl);
                height += 10;
                continue;
            }

            if (stack.peek() == bowl) {
                height += 5;
                stack.push(bowl);
                continue;
            }

            height += 10;
            stack.push(bowl);
        }

        System.out.println(height);
    }
}
