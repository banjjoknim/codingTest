package algorithm;

// 최대공약수 구하는 알고리즘
// 유클리드 호제법
public class GreatestCommonDenominator {
    // 재귀로 구하는 방법
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // 반복문으로 구하는 방법
    int gcd2(int a, int b) {
        int temp = 0;
        int n = 0;

        // a에 큰 값을 위치시키기 위한 조건문
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        //b가 0이 될때까지(a%b), 반복문을 돌게되고, b가 0인 순간의 a를 GCD로 한다.
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}
