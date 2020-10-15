package programmers_level2;

// 멀쩡한 사각형
// 13시 50분 시작. 14시 40분 완료. 풀이보고 하였음.
// 1. 최대공약수 구하기 GCD 알고리즘.
// 2. 깨진 블럭 수 = 가로길이 + 세로길이 - 최대공약수
public class GoodSquare {
    public long solution(long w, long h) {
        long gcd = gcd(w, h);
        return w * h - ((w / gcd) + (h / gcd) - 1) * gcd;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        long w = 8;
        long h = 12;
        GoodSquare goodSquare = new GoodSquare();
        System.out.println(goodSquare.solution(w, h));
    }
}