package programmers_level2;

// N진수 게임
// 14시 6분 시작. 15시 30분쯤?
// 1. 숫자를 n 진법으로 변환
// 2. 각 자릿수마다 순서 카운트
// 3. 순서 p에 해당하는 자릿수 문자열로 연결
// 4. 반복
public class NBaseNumberGame {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int number = 1;
        if (p == 1) {
            sb.insert(0, 0);
        }
        while (true) {
            String transformedNumber = transform(number, n);
            for (int i = 0; i < transformedNumber.length(); i++) {
                if (sb.toString().length() == t) {
                    return sb.toString();
                }
                count++;
                if (count % m == p && m != p) {
                    sb.append(transformedNumber.charAt(i));
                }
                if (m == p && count % m == 0) {
                    sb.append(transformedNumber.charAt(i));
                }
            }
            number++;
        }
    }

    private String transform(int number, int n) {
        char[] remain = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder();
        while (number >= 1) {
            sb.insert(0, remain[number % n]);
            number = number / n;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        NBaseNumberGame nBaseNumberGame = new NBaseNumberGame();
        System.out.println(nBaseNumberGame.solution(16, 16, 2, 1));
        System.out.println(nBaseNumberGame.transform(26, 16));
    }
}
