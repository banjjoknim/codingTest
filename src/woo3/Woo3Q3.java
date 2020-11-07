package woo3;

public class Woo3Q3 {
    public int solution(int money, String[] expected, String[] actual) {

        int betting = 100;
        for (int i = 0; i < expected.length; i++) {
            if (money == 0) {
                break;
            }
            if (expected[i].equals(actual[i])) {
                money += betting;
                betting = 100;
                continue;
            }
            money -= betting;
            if (money < betting * 2) {
                betting = money;
                continue;
            }
            betting = betting * 2;
        }
        return money;
    }

    public static void main(String[] args) {
        Woo3Q3 woo3Q3 = new Woo3Q3();
        int money = 100000;
        String[] expected = {"H", "T", "H", "T", "H", "T", "H"};
        String[] actual = {"T", "T", "H", "H", "T", "T", "H"};
        System.out.println(woo3Q3.solution(money, expected, actual));
    }
}
