package programmers_level2;

import java.util.Arrays;
import java.util.stream.IntStream;

// 주식 가격
// 12시 00분 시작. 12시 18분 중지. 13시 5분 시작. 13시 18분 완료. 총 18+13 = 31분 소요.
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if(check(prices, price, i)){
                answer[i] = IntStream.range(i, prices.length)
                        .filter(index -> price > prices[index])
                        .findFirst()
                        .getAsInt() - i;
                continue;
            }
            int times = IntStream.range(i, prices.length)
                    .filter(index -> price > prices[index])
                    .findFirst()
                    .orElse(prices.length - 1 - i);
            answer[i] = times;
        }

        return answer;
    }
    boolean check(int[] prices, int price,  int i){
        return IntStream.range(i, prices.length)
                .filter(index -> price > prices[index])
                .findFirst()
                .isPresent();
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        StockPrice stockPrice = new StockPrice();
        System.out.println(Arrays.toString(stockPrice.solution(prices)));
    }
}
