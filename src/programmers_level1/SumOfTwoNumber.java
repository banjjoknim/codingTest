package programmers_level1;

import java.util.*;

// 두 개 뽑아서 더하기
//09시 47분 시작 09시 55분 완료.
public class SumOfTwoNumber {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
//        List<Integer> sums = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = numbers[i] + numbers[j];
//                if (i != j && !sums.contains(sum)) {
//                    sums.add(sum);
                if (i != j) {
                    set.add(sum);
                }
//                }
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.keySet();
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Integer> iterator = set.iterator();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.hasNext());

        return set.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

//        return sums.stream()
//                .mapToInt(Integer::intValue)
//                .sorted()
//                .toArray();
    }

    public static void main(String[] args) {
        SumOfTwoNumber sumOfTwoNumber = new SumOfTwoNumber();
        int[] numbers = {2, 1, 3, 4, 1};
        sumOfTwoNumber.solution(numbers);
//        Arrays.stream(sumOfTwoNumber.solution(numbers))
//                .forEach(System.out::println);
    }
}
