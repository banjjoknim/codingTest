package programmers_level2;

import java.util.Stack;

// 짝지어 제거하기
// 16시 49분 시작. 17시 44분 완료. 그냥 하면 안되고 Stack 자료구조를 이용하니 된다..
public class DeletePairWords {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        DeletePairWords deletePairWords = new DeletePairWords();
        String s = "cdcddcdc";
        System.out.println(deletePairWords.solution(s));
    }
}
