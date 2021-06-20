package programmers_level2;

// 괄호 변환
// 10시 36분 시작. 11시 40분 완료.
public class TransformBracket {
    public String solution(String p) {
        if (checkCorrectBracket(p)) {
            return p;
        }
        return getBrackets(p);
    }

    String getBrackets(String s) {
        String temp;
        if (s.isEmpty()) { // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
            return "";
        }
        int index = getIndex(s);
        String[] strings = divide(s, index);
        if (checkCorrectBracket(strings[0])) { // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
            return strings[0] + getBrackets(strings[1]); // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
        } else { // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            temp = "("; // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            temp = temp + getBrackets(strings[1]); // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            temp = temp + ")"; // 4-3. ')'를 다시 붙입니다.
            temp = temp + reverse(strings[0].substring(1, strings[0].length() - 1)); // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            return temp; // 4-5. 생성된 문자열을 반환합니다.
        }
    }

    String reverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
                continue;
            }
            if (chars[i] == ')') {
                chars[i] = '(';
                continue;
            }
        }
        return String.valueOf(chars);
    }

    int getIndex(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            index++;
            if (chars[i] == '(') {
                count++;
            }
            if (chars[i] == ')') {
                count--;
            }
            if (count == 0) {
                return index;
            }
        }
        return index;
    }

    boolean checkCorrectBracket(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                count++;
            }
            if (chars[i] == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }

    String[] divide(String s, int index) { // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
        return new String[]{s.substring(0, index), s.substring(index)};
    }

    boolean checkBalencedBracket(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                count++;
            }
            if (chars[i] == ')') {
                count--;
            }
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "()))((()";
        TransformBracket transformBracket = new TransformBracket();
        System.out.println(transformBracket.solution(input));
    }
}
