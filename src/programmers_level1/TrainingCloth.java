package programmers_level1;

import java.util.HashSet;
import java.util.Set;

// 18시 23분 시작 실패 측정 못함.
// 탐욕법에 대해 생각해보자..
public class TrainingCloth {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Set<Integer> exist = new HashSet<>();
        for (int i = 0; i < reserve.length; i++) {
            exist.add(reserve[i]);
        }

        for (int i = 0; i < lost.length; i++) {
            if (exist.contains(lost[i])) {
                answer += 1;
                exist.remove(lost[i]);
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (exist.contains(lost[i] - 1)) {
                answer += 1;
                exist.remove(lost[i] - 1);
                continue;
            }
            if (exist.contains(lost[i] + 1)) {
                answer += 1;
                exist.remove(lost[i] + 1);
                continue;
            }
        }

//        int existCount = 0;
//        int reservedCount = 0;
//        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
//        for (int i = 0; i < lost.length; i++) {
//            for (int j = 0; j < reserve.length; j++) {
//                if (lost[i] == reserve[j]) {
//                    existCount += 1;
//                    reserve[j] = -1;
//                    lost[i] = -1;
//                    break;
//                }
//            }
//        }
//
//        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
//        for (int i = 0; i < lost.length; i++) {
//            for (int j = 0; j < reserve.length; j++) {
//                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
//                    reservedCount++;
//                    reserve[j] = -1;
//                    break;
//                }
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        TrainingCloth trainingCloth = new TrainingCloth();
        int[] lost = {1, 3, 5};
        int[] reserve = {3};
        System.out.println(trainingCloth.solution(5, lost, reserve));

    }
}
