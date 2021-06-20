package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 실패율
// 16시 44분 시작. 17시 16분 완료.
public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Failure> failures = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double clearPeople = 0;
            double totalPeople = 0;
            int stageNumber = i;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] > i) {
                    clearPeople += 1;
                    totalPeople += 1;
                    continue;
                }
                if (stages[j] == i) {
                    totalPeople += 1;
                }
            }
            double failureRate = 1.0 - (clearPeople / totalPeople);
            failures.add(new Failure(stageNumber, failureRate));
            System.out.println(stageNumber + " : " + failureRate);
        }
        Collections.sort(failures);
        return failures.stream()
                .mapToInt(Failure::getStageNumber)
                .toArray();
    }

    class Failure implements Comparable<Failure> {
        private int stageNumber;
        private double failureRate;

        public int getStageNumber() {
            return stageNumber;
        }

        public double getFailureRate() {
            return failureRate;
        }

        public Failure(int stageNumber, double failureRate) {
            this.stageNumber = stageNumber;
            this.failureRate = failureRate;
        }

        @Override
        public int compareTo(Failure o) {
            if (this.failureRate > o.failureRate) {
                return -1;
            }
            if (this.failureRate < o.failureRate) {
                return 1;
            }
            if (this.failureRate == o.failureRate) {
                return Integer.compare(this.stageNumber, o.stageNumber);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        FailureRate failureRate = new FailureRate();
        Arrays.stream(failureRate.solution(N, stages)).forEach(System.out::println);
    }
}
