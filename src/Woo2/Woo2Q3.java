package Woo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 16분 걸림
public class Woo2Q3 {
    public int solution(int[] prices, int[] discounts) {
        int answer = 0;
        List<Integer> priceList = Arrays.stream(prices)
            .boxed()
            .sorted(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -o1 + o2;
                }
            })
            .collect(Collectors.toList());
        List<Integer> discountList = Arrays.stream(discounts)
            .boxed()
            .sorted(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            })
            .collect(Collectors.toList());

        answer += IntStream.range(0, discountList.size())
            .mapToDouble(index -> priceList.get(index) * (100 - discountList.get(index)) / 100)
            .sum();
        answer += IntStream.range(0, priceList.size())
            .skip(discountList.size())
            .map(index -> priceList.get(index))
            .sum();

        return answer;
    }

    public static void main(String[] args) {
        Woo2Q3 woo2Q3 = new Woo2Q3();
        // int[] prices = {13000, 88000, 10000};
        int[] prices = {32000, 18000, 42500};
        // int[] discounts = {30, 20};
        int[] discounts = {50, 20, 65};
        System.out.println(woo2Q3.solution(prices, discounts));
    }
}
