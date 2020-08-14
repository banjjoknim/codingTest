//12시 15분 시작 01시 30분 완료.
//돼지 족 4kg, 양파 50g, 대파 10cm, 마늘 10g, 고추 4g
//돼지 족 10kg당 10000원, 양파(100g) 3000원, 대파(30cm) 1000원
// 마늘 50g 2000원, 고추 10g 1000원
//재고 : 돼지 족 5kg, 양파 100g, 대파 10cm, 마늘 5g, 고추 2g
//준은 1,2인분 먹고 안굶음. 애인은 0, 0.5인분 먹음, 애인이 먹으면 고추를 절반만.
//삼품은 제시된 단위별로만 구매 가능.
//지출 금액 계산하여 배열 형식으로 return,
//제한 사항을 벗어나는 경우 -1 return.

class Stock {
    private int porkFeet;
    private int onion;
    private int greenOnion;
    private int garlic;
    private int pepper;

    public int getPorkFeet() {
        return porkFeet;
    }

    public int getOnion() {
        return onion;
    }

    public int getGreenOnion() {
        return greenOnion;
    }

    public int getGarlic() {
        return garlic;
    }

    public int getPepper() {
        return pepper;
    }

    public void setPorkFeet(int porkFeet) {
        this.porkFeet = porkFeet;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public void setGreenOnion(int greenOnion) {
        this.greenOnion = greenOnion;
    }

    public void setGarlic(int garlic) {
        this.garlic = garlic;
    }

    public void setPepper(int pepper) {
        this.pepper = pepper;
    }
}

public class Woo5 {
//    재고가 레시피보다 적을때 구매, 재고 추가

    public int[] solution(String[] history) {

        int[] answer = {};
        Stock stock = new Stock();
        stock.setPorkFeet(5);
        stock.setOnion(100);
        stock.setGreenOnion(10);
        stock.setGarlic(5);
        stock.setPepper(2);

        boolean check = false;
        answer = new int[history.length];
        for (int i = 0; i < history.length; i++) {
            if(history[i].split("\\.")[0].equals("0")){
                check = false;
                answer = new int[] {-1};
                break;
            }
            int amount = 0;
            double eat = Double.parseDouble(history[i]);
            if (stock.getPorkFeet() < 4 * eat) {
                amount = amount + 10000;
                stock.setPorkFeet(stock.getPorkFeet() + 10 - (int)(4 * eat));
            } else {
                stock.setPorkFeet(stock.getPorkFeet() - (int)(4 * eat));
            }
            if (stock.getOnion() < 50 * eat) {
                amount = amount + 3000;
                stock.setOnion(stock.getOnion() + 100 - (int)(50 * eat));
            } else {
                stock.setOnion(stock.getOnion() - (int)(50 * eat));
            }
            if (stock.getGreenOnion() < 10 * eat) {
                amount = amount + 1000;
                stock.setGreenOnion(stock.getGreenOnion() + 30 - (int)(10 * eat));
            } else {
                stock.setGreenOnion(stock.getGreenOnion() - (int)(10 * eat));
            }
            if (stock.getGarlic() < 10 * eat) {
                amount = amount + 2000;
                stock.setGarlic(stock.getGarlic() + 50 - (int)(10 * eat));
            } else {
                stock.setGarlic(stock.getGarlic() - (int)(10 * eat));
            }
            if (history[i].split("\\.")[1].equals("0")) {
                if (stock.getPepper() < 4 * eat) {
                    amount = amount + 1000;
                    stock.setPepper((stock.getPepper() + 10 - (int)(4 * eat)));
                } else {
                    stock.setPepper((stock.getPepper() - (int)(4 * eat)));
                }
            } else {
                if (stock.getPepper() < 2 * eat) {
                    amount = amount + 1000;
                    stock.setPepper((stock.getPepper() + 10 - (int)(2 * eat)));
                } else {
                    stock.setPepper((stock.getPepper() - (int)(2 * eat)));
                }
            }

            answer[i] = amount;
            check = true;
        }

        if(check) {
            return answer;
        } else {
            return new int[] {-1};
        }

    }

    public static void main(String[] args) {
        int[] answer = {};
        Woo5 woo5 = new Woo5();
        String[] history = new String[]{"1.0", "2.0", "1.5"};
        answer = woo5.solution(history);

    }
}
