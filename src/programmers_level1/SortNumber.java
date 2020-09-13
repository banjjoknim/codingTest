package programmers_level1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 20시 57분 시작. 21시 14분 완료.
public class SortNumber {
    public long solution(long n) {
        String temp = Arrays.stream(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt)
            .sorted()
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        return Long.valueOf(String.valueOf(sb));
    }
    // String s = "";
    // for (int number : numbers) {
    //     s += String.valueOf(number);
    // }
    // StringBuilder stringBuilder = new StringBuilder(s);
    // stringBuilder.reverse();
    // return Long.valueOf(String.valueOf(stringBuilder));

    public static void main(String[] args) {
        long l = 128372;
        SortNumber sortNumber = new SortNumber();
        System.out.println(sortNumber.solution(l));
    }
}
