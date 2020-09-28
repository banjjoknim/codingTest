package programmers_level2;

// 124 나라의 숫자
// 10시 시작 10시 24분 중지. 10시 38분 시작. 11시 22분 완료.
// 풀이 보고 풀었음... 효율성 테스트 실패. 제한사항을 잘볼 것.
public class Number124 {
    //    public String solution(int n) {
//        int count = 1;
//        int number = 1;
//        while (true) {
//            if (number == n) {
//                break;
//            }
//            count++;
//            String numbers = String.valueOf(count);
//            if (numbers.chars()
//                    .allMatch(i -> i == '2' || i == '1' || i == '4')) {
//                number++;
//            }
//        }
//        return String.valueOf(count);
//    }
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while (num > 0) {
            int remainder = num % 3;
            num /= 3;

            if (remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        Number124 number124 = new Number124();
        System.out.println(number124.solution(13));
    }
}
