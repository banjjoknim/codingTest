package algorithm;

// 10진수를 N진법으로 바꾸는 알고리즘
public class TransformNBaseNumber {
    private String toNBaseNumberString1(int number, int n) {
        String NBaseNumber = "";
        while (number >= 1) {
            NBaseNumber = (number % n) + NBaseNumber;
            number = number / n;
        }
        return NBaseNumber;
    }

    private String toNBaseNumberString2(int number, int n) {
        StringBuilder sb = new StringBuilder();
        while (number >= 1) {
            // 숫자를 나눈 나머지를 앞에 넣어준다.
            sb.insert(0, number % n);
            // 숫자를 나눈 몫으로 바꿔준다.
            number = number / n;
        }
        return sb.toString();
    }
}
