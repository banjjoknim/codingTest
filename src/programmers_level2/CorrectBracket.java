package programmers_level2;

// 올바른 괄호
// 10시 03분 시작. 10시 30분 완료. 풀이 약간 참조.
// 1. 괄호 갯수 확인
// 2. 시작과 끝 괄호 확인
// Stack을 이용하여 여는괄호일때 push, 닫는 괄호일때 pop하여 마지막에 stack이 비어있으면 true 리턴.
public class CorrectBracket {
//    boolean solution(String s) {
//        boolean answer = true;
//        if (s.startsWith(")") || s.endsWith("(")) {
//            return false;
//        }
//        Stack<String> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '(') {
//                stack.push(Character.toString(chars[i]));
//            }
//            if (chars[i] == ')' && !stack.isEmpty()) {
//                stack.pop();
//            }
//        }
//        if(!stack.isEmpty()){
//            return false;
//        }
//        return answer;
//    }

    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                break;
            }
        }
        if (count == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        CorrectBracket correctBracket = new CorrectBracket();
        System.out.println(correctBracket.solution("()()"));
    }
}
