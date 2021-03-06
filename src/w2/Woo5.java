package w2;//12시 15분 시작 01시 30분 완료.
//돼지 족 4kg, 양파 50g, 대파 10cm, 마늘 10g, 고추 4g
//돼지 족 10kg당 10000원, 양파(100g) 3000원, 대파(30cm) 1000원
//마늘 50g 2000원, 고추 10g 1000원
//재고 : 돼지 족 5kg, 양파 100g, 대파 10cm, 마늘 5g, 고추 2g
//준은 1,2인분 먹고 안굶음. 애인은 0, 0.5인분 먹음, 애인이 먹으면 고추를 절반만.
//삼품은 제시된 단위별로만 구매 가능.
//지출 금액 계산하여 배열 형식으로 return,
//제한 사항을 벗어나는 경우 -1 return.

public class Woo5 {
    //  재고가 레시피보다 적을때 구매, 재고 추가

    public int[] solution(String[] history) {

        int[] answer = new int[history.length];

        int porkFeet = 5;
        int onion = 100;
        int greenOnion = 10;
        int garlic = 5;
        int pepper = 2;
        int porkFeetPrice = 10000; // 10
        int onionPrice = 3000; // 100
        int greenOnionPrice = 1000; // 30
        int garlicPrice = 2000; // 50
        int pepperPrice = 1000; // 10
        int requiredPorkFeet = 4;
        int requiredOnion = 50;
        int requiredGreenOnion = 10;
        int requiredGarlic = 10;
        int requiredPepper = 4;

        for (int i = 0; i < history.length; i++) {
            int amount = 0;
            if (Integer.parseInt((history[i].split("\\.")[1])) == 0
                    || Integer.parseInt((history[i].split("\\.")[1])) == 5) {
            } else {
                return new int[]{-1};
            }
            if (Integer.parseInt((history[i].split("\\.")[0])) == 1
                    || Integer.parseInt((history[i].split("\\.")[0])) == 2) {
            } else {
                return new int[]{-1};
            }

            while (porkFeet < requiredPorkFeet * Double.parseDouble(history[i])) {
                porkFeet = porkFeet + 10;
                amount = amount + porkFeetPrice;
            }
            porkFeet = porkFeet - (int) (requiredPorkFeet * Double.parseDouble(history[i]));

            while (onion < requiredOnion * Double.parseDouble(history[i])) {
                onion = onion + 100;
                amount = amount + onionPrice;
            }
            onion = onion - (int) (requiredOnion * Double.parseDouble(history[i]));

            while (greenOnion < requiredGreenOnion * Double.parseDouble(history[i])) {
                greenOnion = greenOnion + 30;
                amount = amount + greenOnionPrice;
            }
            greenOnion = greenOnion - (int) (requiredGreenOnion * Double.parseDouble(history[i]));

            while (garlic < requiredGarlic * Double.parseDouble(history[i])) {
                garlic = garlic + 50;
                amount = amount + garlicPrice;
            }
            garlic = garlic - (int) (requiredGarlic * Double.parseDouble(history[i]));

            if (Integer.parseInt((history[i].split("\\.")[1])) == 5) {
                requiredPepper = 2;
            } else {
                requiredPepper = 4;
            }

            while (pepper < (int) (requiredPepper * Double.parseDouble(history[i]))) {
                pepper = pepper + 10;
                amount = amount + pepperPrice;
            }
            pepper = pepper - (int) (requiredPepper * Double.parseDouble(history[i]));

            answer[i] = amount;
        }

        return answer;

    }

    public static void main(String[] args) {
        Woo5 woo5 = new Woo5();
        String[] history = new String[]{"1.5", "2.0", "1.0"};
        int[] answer = woo5.solution(history);
        for (int i = 0; i < history.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

}
