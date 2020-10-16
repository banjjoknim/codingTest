package programmers_level2;

// JadenCase 문자열 만들기
// 20시 57분 시작. 21시 58분 완료.
// 풀이 참고 하였음.
// 1. 첫번째 글자가 영문이 아닐때
// 2. 첫번째 글자가 영문일때
// 3. 연속된 공백 처리
public class JadenCaseWord {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        boolean isBlank = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                isBlank = true;
                sb.append(chars[i]);
                continue;
            }
            if (i == 0 && checkAlphabet(chars[i])) {
                sb.append(Character.toUpperCase(chars[i]));
                continue;
            }
            if (checkAlphabet(chars[i])) {
                if (isBlank) {
                    sb.append(Character.toUpperCase(chars[i]));
                    isBlank = false;
                    continue;
                }
                sb.append(Character.toLowerCase(chars[i]));
                continue;
            }
            sb.append(chars[i]);
            isBlank = false;
        }
        return sb.toString();
    }

    public String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

    private boolean checkAlphabet(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public static void main(String[] args) {
        String s2 = "3 2peo3ple unFollowed me";
        JadenCaseWord jadenCaseWord = new JadenCaseWord();
        System.out.println(jadenCaseWord.solution(s2));
    }
}
