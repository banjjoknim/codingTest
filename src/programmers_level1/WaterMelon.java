package programmers_level1;

// 21시 44분 시작
public class WaterMelon {
    public String solution(int n) {
        String answer = "";
        String pattern = "박수";
        for (int i = 1; i <= n; i++) {
            answer += pattern.split("")[i % 2];
        }
        return answer;
    }
}
