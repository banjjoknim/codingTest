package programmers_level2;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 위장
// 결국 풀이 봤음.
public class Spy {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> clothesMap = new HashMap<>(); // 종류 : 갯수

        for (int i = 0; i < clothes.length; i++) {
            // 종류 여부 판단. 같은 종류 일 경우 Value + 1
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        // 경우의 수 체크 answer *= (옷 가지수 + 안 입을 경우)
        for (int value : clothesMap.values()) {
            answer *= (value + 1);
        }

        // 모두 다 안입는 경우는 존재하지 않으므로 -1
        // return answer - 1;
        return Arrays.stream(clothes)
            .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
            .values()
            .stream()
            .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;

    }

    static class Cloth {
        private String name;

        public Cloth(String name, String category) {
            this.name = name;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        private String category;
    }

    public static void main(String[] args) {
        String[][] clothes = new String[][] {{"asd", "1"}, {"asdasd", "1"}, {"alksmd", "2"}};
        int answer = Arrays.stream(clothes)
            .collect(groupingBy(cloth -> cloth[1], mapping(cloth -> cloth[0], counting())))
            .values()
            .stream()
            .reduce(1L, (x, y) -> x * (y + 1))
            .intValue() - 1;
        System.out.println(answer);
        System.out.println(
            Arrays.stream(clothes)
                .map(cloth -> new Cloth(cloth[0], cloth[1]))
                .collect(Collectors.partitioningBy(cloth -> cloth.getCategory().equals("1")))
        );
    }
}
