package programmers_level1;

// 23시 13분 시작. 23시 42분 완료, 최대공약수, 최소공배수 알고리즘 공부할 것.
public class GreatestCommonDivisor {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        int gcd = n;
        int lcm = a * b / gcd; // least common multiple : 최소공배수
        return new int[] {gcd, lcm};
    }
}
