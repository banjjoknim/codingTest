package w2Stream;

//02시 23분 시작. 03시 18분 완료.
public class Question5 {
    public int[] solution(String[] history) {
        int[] answer = new int[history.length];
        final int pigFootPrice = 10000;
        final int onionPrice = 3000;
        final int greenOnionPrice = 1000;
        final int garlicPrice = 2000;
        final int pepperPrice = 1000;

        int pigFoot = 5;
        int onion = 100;
        int greenOnion = 10;
        int garlic = 5;
        int pepper = 2;

        for (int i = 0; i < history.length; i++) {
            if (!history[i].split("\\.")[0].equals("1")) {
                if (!history[i].split("\\.")[0].equals("2")) {
                    return new int[] {-1};
                }
            }

            if (!history[i].split("\\.")[1].equals("0")) {
                if (!history[i].split("\\.")[1].equals("5")) {
                    return new int[] {-1};
                }
            }

            int price = 0;
            int requiredPigFoot = (int)(4 * Double.parseDouble(history[i]));
            int requiredOnion = (int)(50 * Double.parseDouble(history[i]));
            int requiredGreenOnion = (int)(10 * Double.parseDouble(history[i]));
            int requiredGarlic = (int)(10 * Double.parseDouble(history[i]));
            int requiredPepper = (int)(4 * Double.parseDouble(history[i]));
            if (history[i].split("\\.")[1].equals("5")) {
                requiredPepper = requiredPepper / 2;
            }
            while (pigFoot < requiredPigFoot) {
                pigFoot = pigFoot + 10;
                price += pigFootPrice;
            }
            pigFoot = pigFoot - requiredPigFoot;

            while (onion < requiredOnion) {
                onion = onion + 100;
                price += onionPrice;
            }
            onion = onion - requiredOnion;

            while (greenOnion < requiredGreenOnion) {
                greenOnion = greenOnion + 30;
                price += greenOnionPrice;
            }
            greenOnion = greenOnion - requiredGreenOnion;

            while (garlic < requiredGarlic) {
                garlic = garlic + 50;
                price += garlicPrice;
            }
            garlic = garlic - requiredGarlic;

            while (pepper < requiredPepper) {
                pepper = pepper + 10;
                price += pepperPrice;
            }
            pepper = pepper - requiredPepper;
            answer[i] = price;
        }

        return answer;

    }

}
