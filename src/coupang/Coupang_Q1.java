package coupang;

import java.util.Arrays;

// 1. k 진수로 변환
// 2. 자릿수끼리 곱함
// 3. 1, 2의 과정을 2, 9 까지 반복
// 4. 가장 큰 자릿수 곱이 나오는 k를 구함
// 5. 정렬하여 가장 큰 k 출력 및 그때의 자릿수 곱을 출력.
// 19시 시작. 20시 50분 완료.
public class Coupang_Q1 {
    public int[] solution(int n) {
        int digit = 0;
        int target = 0;
        int[] answer = new int[2];
        for (int i = 2; i < 10; i++) {
            int aNew = getNew(n, i, digit, target);
            if (aNew >= answer[1]) {
                answer[0] = i;
                answer[1] = aNew;
            }
        }

        return answer;
    }

    private int getNew(int n, int number, int digit, int target) {
        while (n > target) {
            target = (int) Math.pow(number, digit);
            digit++;
        }
        int[] answer = new int[digit - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = n / (int) Math.pow(number, answer.length - i - 1);
            n = n % (int) Math.pow(number, answer.length - i - 1);
        }
        return Arrays.stream(answer)
                .filter(num -> num != 0)
                .reduce(1, (x, y) -> x * y);

    }

    public static void main(String[] args) {
        Coupang_Q1 coupang_q1 = new Coupang_Q1();
        int n = 14;
        System.out.println(Arrays.toString(coupang_q1.solution(n)));
    }
}
