package Woo2;

import java.util.Arrays;

// 27분 소요.
public class Woo2Q5 {
    private static final int REQUIRED_PIG_FOOT = 4;
    private static final int REQUIRED_ONION = 50;
    private static final int REQUIRED_GREEN_ONION = 10;
    private static final int REQUIRED_GARLIC = 10;
    private static final int REQUIRED_PEPPER = 4;
    private static final int PIG_FOOT_PRICE = 10000;
    private static final int ONION_PRICE = 3000;
    private static final int GREEN_ONION_PRICE = 1000;
    private static final int GARLIC_PRICE = 2000;
    private static final int PEPPER_PRICE = 1000;

    public int[] solution(String[] history) {
        double pigFoot = 5;
        double onion = 100;
        double greenOnion = 10;
        double garlic = 5;
        double pepper = 2;

        int[] answer = new int[history.length];
        for (int i = 0; i < history.length; i++) {
            int price = 0;
            String[] input = history[i].split("\\.");
            if (Integer.valueOf(input[0]) != 1 && Integer.valueOf(input[0]) != 2) {
                return new int[] {-1};
            }
            if (Integer.valueOf(input[1]) != 0 && Integer.valueOf(input[1]) != 5) {
                return new int[] {-1};
            }
            double requiredPigFoot = Double.valueOf(history[i]) * REQUIRED_PIG_FOOT;
            double requiredOnion = Double.valueOf(history[i]) * REQUIRED_ONION;
            double requiredGreenOnion = Double.valueOf(history[i]) * REQUIRED_GREEN_ONION;
            double requiredGarlic = Double.valueOf(history[i]) * REQUIRED_GARLIC;
            double requiredPepper = Double.valueOf(history[i]) * REQUIRED_PEPPER;
            if (input[1].equals("5")) {
                requiredPepper /= 2;
            }
            while (pigFoot < requiredPigFoot) {
                pigFoot += 10;
                price += PIG_FOOT_PRICE;
            }
            pigFoot = pigFoot - requiredPigFoot;

            while (onion < requiredOnion) {
                onion += 100;
                price += ONION_PRICE;
            }
            onion = onion - requiredOnion;

            while (greenOnion < requiredGreenOnion) {
                greenOnion += 30;
                price += GREEN_ONION_PRICE;
            }
            greenOnion = greenOnion - requiredGreenOnion;

            while (garlic < requiredGarlic) {
                garlic += 50;
                price += GARLIC_PRICE;
            }
            garlic = garlic - requiredGarlic;

            while (pepper < requiredPepper) {
                pepper += 10;
                price += PEPPER_PRICE;
            }
            pepper = pepper - requiredPepper;
            answer[i] = price;
        }
        return answer;
    }

    public static void main(String[] args) {
        Woo2Q5 woo2Q5 = new Woo2Q5();
        String[] history = {"1.0", "2.0", "1.5"};
        System.out.println(Arrays.toString(woo2Q5.solution(history)));
    }
}
