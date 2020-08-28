package w2Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question3 {
    public int solution(int[] prices, int[] discounts) {
        List<Integer> priceList = Arrays.stream(prices)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        List<Integer> discountList = Arrays.stream(discounts)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        return getAmount(priceList, discountList);
    }

    private int getAmount(List<Integer> priceList, List<Integer> discountList) {

        return IntStream.range(0, priceList.size()).limit(discountList.size())
            .map(index -> priceList.get(index) * (100 - discountList.get(index)) / 100)
            .sum()
            + IntStream.range(0, priceList.size()).skip(discountList.size())
            .map(index -> priceList.get(index))
            .sum();
    }
}

