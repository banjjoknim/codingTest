package programmers_level1;

import java.util.stream.IntStream;

// 18시 23분 시작
public class TrainingCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] check = new boolean[n];
        boolean[] reserveCheck = new boolean[n];
        int count = reserve.length;
        for (int i = 0; i < lost.length; i++) {
            if (count == 0) {
                break;
            }
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] + 1 == reserve[j]) && !reserveCheck[reserve[j] - 1]) {
                    check[lost[i] - 1] = true;
                    reserveCheck[reserve[j] - 1] = true;
                    count -= 1;
                    break;
                }
            }
        }
        return (int) IntStream.range(0, n)
            .filter(index -> check[index])
            .count() + n - lost.length;
    }

    public static void main(String[] args) {
        TrainingCloth trainingCloth = new TrainingCloth();
        int[] lost = {2, 4};
        int[] reserve = {3};
        System.out.println(trainingCloth.solution(5, lost, reserve));
    }
}
