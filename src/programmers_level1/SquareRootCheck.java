package programmers_level1;

// 22시 32분 시작 22시 41분 완료.
public class SquareRootCheck {
    public long solution(long n) {
        if (Math.sqrt(n) != (int) Math.sqrt(n)) {
            return -1;
        }
        return (long) Math.pow(Math.sqrt(n) + 1, 2);
    }

    public static void main(String[] args) {
        long n = 3;
        SquareRootCheck squareRootCheck = new SquareRootCheck();
        System.out.println(squareRootCheck.solution(n));
    }
}
