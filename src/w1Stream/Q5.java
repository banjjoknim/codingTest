package w1Stream;

// 04시 06분 시작 04시 21분 완료.
public class Q5 {
    public int solution(int number) {
        int answer = 0;
        for (int i = 1; i < number; i++) {
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                if (Integer.parseInt(Character.toString(String.valueOf(i).charAt(j))) % 3 == 0
                    && Integer.parseInt(Character.toString(String.valueOf(i).charAt(j))) != 0) {
                    answer += 1;
                    System.out.println(i);
                }
            }
        }
        return answer;
    }
}
