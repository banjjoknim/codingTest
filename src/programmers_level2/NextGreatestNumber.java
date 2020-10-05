package programmers_level2;

// 다음 큰 숫자
// 09시 42분 시작. 10시 완료.
// 1. 2진수로 변환
// 2. 1의 갯수 세기
// 3. 조건을 만족하는 그 다음 수 구하기.
// Integer.bitCount() -> 2진수의 숫자데이터의 비트데이터중 1비트의 수를 세주는 함수.
public class NextGreatestNumber {
    public int solution(int n) {
        int number = n;
        int inputCount = Integer.bitCount(number);
        while (true) {
            number++;
            int count = Integer.bitCount(number);
            if (count == inputCount) {
                return number;
            }
        }
    }

    public static void main(String[] args) {
        NextGreatestNumber nextGreatestNumber = new NextGreatestNumber();
        System.out.println(nextGreatestNumber.solution(78));
    }
}
