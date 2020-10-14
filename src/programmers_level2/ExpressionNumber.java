package programmers_level2;

// 숫자의 표현
// 16시 10분 시작. 16시 40분 완료.
// 1. 1부터 시작해서 숫자를 올려가며 순차적으로 더한다.
// 2. 순차적으로 더해서 같으면 answer + 1
public class ExpressionNumber {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum = sum + j;
                if (sum == n) {
                    answer++;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    // 주어진 자연수를 연속한 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 갯수와 같다.(정수론)
    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        ExpressionNumber expressionNumber = new ExpressionNumber();
        System.out.println(expressionNumber.solution(n));
    }
}
