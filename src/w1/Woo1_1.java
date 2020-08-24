package w1;

public class Woo1_1 {
    // 12시 30분 시작. 12시 47분 완료.
    // 5만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원, 일원
    // 각각 몇 개로 변환되는지 금액이 큰 순서대로 배열에 담아서 return
    int w50000 = 50000;
    int w10000 = 10000;
    int w5000 = 5000;
    int w1000 = 1000;
    int w500 = 500;
    int w100 = 100;
    int w50 = 50;
    int w10 = 10;
    int w1 = 1;

    public int[] solution(int money) {
        int[] answer = {};
        int remainMoneyBy50000 = money % w50000;
        int remainMoneyBy10000 = remainMoneyBy50000 % w10000;
        int remainMoneyBy5000 = remainMoneyBy10000 % w5000;
        int remainMoneyBy1000 = remainMoneyBy5000 % w1000;
        int remainMoneyBy500 = remainMoneyBy1000 % w500;
        int remainMoneyBy100 = remainMoneyBy500 % w100;
        int remainMoneyBy50 = remainMoneyBy100 % w50;
        int remainMoneyBy10 = remainMoneyBy50 % w10;
        int remainMoneyBy1 = remainMoneyBy10 / w1;
        answer = new int[9];
        answer[0] = money / 50000;
        answer[1] = remainMoneyBy50000 / 10000;
        answer[2] = remainMoneyBy10000 / 5000;
        answer[3] = remainMoneyBy5000 / 1000;
        answer[4] = remainMoneyBy1000 / 500;
        answer[5] = remainMoneyBy500 / 100;
        answer[6] = remainMoneyBy100 / 50;
        answer[7] = remainMoneyBy50 / 10;
        answer[8] = remainMoneyBy10 / 1;
        return answer;
    }

    public static void main(String[] args) {
        Woo1_1 woo1_1 = new Woo1_1();
        int[] answer = woo1_1.solution(15000);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
