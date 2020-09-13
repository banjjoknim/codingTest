package programmers_level1;

import java.util.Arrays;

// 20시 41분 시작 20시 45분 완료.
public class SumOfDigit {
    public int solution(int n) {
        // int answer = 0;
        // char[] numbers = String.valueOf(n).toCharArray();
        // for (int i = 0; i < numbers.length; i++) {
        //     answer += Integer.valueOf(String.valueOf(numbers[i]));
        // }
        // return answer;

        return Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(number -> Integer.valueOf(number))
            .sum();

        // return Arrays.stream(String.valueOf(n).split(""))
        //     .mapToInt(Integer::parseInt)
        //     .sum();
        
    }
}
