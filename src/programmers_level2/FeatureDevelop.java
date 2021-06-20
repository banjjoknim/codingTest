package programmers_level2;

import java.util.*;

// 기능 개발
// 13시 57분 시작. 14시 43분 완료
public class FeatureDevelop {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int days = 0;
            while (progresses[i] < 100) {
                days++;
                progresses[i] += speeds[i];
            }
            list.add(days);
        }

        Map<Integer, Integer> answer = new HashMap<>();
        int completeDays = 0;
        while (!list.isEmpty()) {
            if (list.get(0) > completeDays) {
                completeDays = list.get(0);
                list.remove(0);
                answer.put(completeDays, 1);
                continue;
            }
            if (list.get(0) <= completeDays) {
                list.remove(0);
                answer.put(completeDays, answer.get(completeDays) + 1);
            }
        }
        return answer.keySet().stream()
                .sorted()
                .mapToInt(key -> answer.get(key))
                .toArray();
    }

    public int[] another(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

    public static void main(String[] args) {
        FeatureDevelop featureDevelop = new FeatureDevelop();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
//        System.out.println(Arrays.toString(featureDevelop.solution(progresses, speeds)));
        System.out.println(Arrays.toString(featureDevelop.another(progresses, speeds)));
    }
}
