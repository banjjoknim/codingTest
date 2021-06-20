package programmers_level2;

// 예상 대진표
// 13시 6분 시작. 13시 45분 완료.
public class ExpectedDraw {
    public int solution(int n, int a, int b) {
        int answer = 1;

        while (true) {
            // 참가 번호가 1, 2 인경우 리턴
            if (Math.max(a, b) % 2 == 0 && Math.max(a, b) - Math.min(a, b) == 1) {
                return answer;
            }
            a = getNextNumber(a);
            b = getNextNumber(b);
            answer++;
        }
//        ?????????XOR연산???????????????
//        return Integer.toBinaryString((a-1)^(b-1)).length();

    }

    // 참가번호 변경
    private int getNextNumber(int number) {
        if (number % 2 == 0) {
            return number / 2;
        }
        return (number / 2) + 1;
    }

    public static void main(String[] args) {
        ExpectedDraw expectedDraw = new ExpectedDraw();
        System.out.println(expectedDraw.solution(8, 2, 3));
    }
}
