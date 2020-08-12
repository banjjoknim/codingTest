import java.util.ArrayList;
import java.util.List;

public class Woo3 {

    public int solution(int[] prices, int[] discounts) {
        int answer = 0;

        List<Integer> priceList = new ArrayList<Integer>();
        List<Integer> discountList = new ArrayList<Integer>();

        int maxPrice = 5000;
        int maxDiscount = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= maxPrice) {
                maxPrice = prices[i];
                priceList.add(0, prices[i]);
            }
            if (prices[i] < maxPrice) {
                if (prices[i] >= priceList.get(priceList.size() - 1)) {
                    for (int j = 0; j < priceList.size(); j++) {
                        if (prices[i] >= priceList.get(j)) {
                            priceList.add(j, prices[i]);
                            break;
                        }
                    }
                }
                if (prices[i] < priceList.get(priceList.size() - 1)) {
                    priceList.add(i, prices[i]);
                }
            }
        }
        for (int i = 0; i < discounts.length; i++) {
            if (discounts[i] >= maxDiscount) {
                maxDiscount = discounts[i];
                discountList.add(0, discounts[i]);
            }
            if (discounts[i] < maxDiscount) {
                if (discounts[i] >= discountList.get(discountList.size() - 1)) {
                    for (int j = 0; j < discountList.size(); j++) {
                        if (discounts[i] >= discountList.get(j)) {
                            discountList.add(j, discounts[i]);
                            break;
                        }
                    }
                }
                if (discounts[i] < discountList.get(discountList.size() - 1)) {
                    discountList.add(i, discounts[i]);
                }
            }
        }

        for (int i = 0; i < discountList.size(); i++) {
            answer = answer + priceList.get(i) * (100 - discountList.get(i)) / 100;
        }

        for (int i = 0; i < priceList.size() - discountList.size(); i++) {
            answer = answer + priceList.get(discountList.size() + i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = 0;

        int[] prices = {13000, 88000, 10000};
        int[] discounts = {30, 20};
        //		int[] reversePrices = new int[prices.length];
        //		Arrays.sort(prices);
        //		for(int i = 0; i<prices.length; i++) {
        //			reversePrices[i] = prices[prices.length-1-i];
        //			System.out.println(reversePrices[i]);
        //		}

        Woo3 woo3 = new Woo3();
        answer = woo3.solution(prices, discounts);
        System.out.println(answer);

    }

}
