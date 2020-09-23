package programmers_level2;

import java.util.*;
import java.util.stream.Collectors;

// 가장 큰 수
// 13시 50분 시작. 15시 12분 완료. 결국 해설 찾아봄.
public class GreatestNumber {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        String answer = Arrays.stream(strings)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return (o2 + o1).compareTo(o1 + o2);
                    }
                })
                .collect(Collectors.joining());
        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        GreatestNumber greatestNumber = new GreatestNumber();
        System.out.println(greatestNumber.solution(numbers));
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1+o2).compareTo(o2+o1);
            }
        };
        String[] strings = new String[]{"300", "3"};
        Arrays.sort(strings, comparator);
        System.out.println(Arrays.stream(strings).collect(Collectors.joining()));
    }
}
