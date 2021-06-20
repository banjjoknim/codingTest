package w1Stream;

// 01시 45분 시작 02시 03분 완료.
public class Q1 {
    public int[] solution(int money) {
        int[] answer = new int[9];
        int[] division = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        for (int i = 0; i < division.length; i++) {
            answer[i] = money / division[i];
            money = money % division[i];
        }
        return answer;
    }
}
