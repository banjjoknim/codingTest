package programmers_level1;

// 19시 06분 시작.. 금방 풀었음..
public class CenterString {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 1) {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        return answer;
        // return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
