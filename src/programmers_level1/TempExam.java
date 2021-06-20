package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 측정 못함
public class TempExam {
    public int[] solution(int[] answers) {
        List<GiveUpPeople> peoples = new ArrayList<>();
        int[][] pattern = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        for (int j = 0; j < pattern.length; j++) {
            int patternSize = pattern[j].length;
            int score = 0;
            int length = answers.length;
            for (int i = 0; i < length; i++) {
                if (pattern[j][i % patternSize] == answers[i]) {
                    score += 1;
                }
            }
            peoples.add(new GiveUpPeople(j + 1, score));
        }
        int max = 0;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < peoples.size(); i++) {
            if (peoples.get(i).getScore() > max) {
                max = peoples.get(i).getScore();
            }
        }
        for (int i = 0; i < peoples.size(); i++) {
            if (peoples.get(i).getScore() == max) {
                answer.add(peoples.get(i).getNumber());
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    class GiveUpPeople {
        private int number;
        private int score;

        public GiveUpPeople(int number, int score) {
            this.number = number;
            this.score = score;
        }

        public int getNumber() {
            return number;
        }

        public int getScore() {
            return score;
        }
    }

    // @Override
    // public int compareTo(GiveUpPeople o) {
    //     if (this.score > o.score) {
    //         return 1;
    //     }
    //     if (this.score < o.score) {
    //         return -1;
    //     }
    //     if (this.score == o.score) {
    //         return Integer.compare(this.number, o.number);
    //     }
    //     return 0;
    // }

    public static void main(String[] args) {
        TempExam tempExam = new TempExam();
        Arrays.stream(tempExam.solution(new int[]{1, 3, 2, 4, 2})).forEach(System.out::print);
    }
}
