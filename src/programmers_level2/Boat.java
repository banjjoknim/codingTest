package programmers_level2;

import java.util.Arrays;

// 구명보트
// 16시 44분 시작. 17시 25분 완료.
// 1. 구명보트는 한 번에 최대 2명밖에 탈 수 없다
// 2. 무게 제한이 존재한다.
// 3. 가장 무게가 작은 사람과 무게가 큰 사람을 짝지어서 태운다.
public class Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
//        List<Integer> peoples = Arrays.stream(people)
//                .boxed()
//                .sorted()
//                .collect(Collectors.toList());
//        while (!peoples.isEmpty()) {
//            answer++;
//            int nowWeight = limit;
//            nowWeight = limit - peoples.get(peoples.size() - 1);
//            peoples.remove(peoples.size() - 1);
//            if (!peoples.isEmpty() && nowWeight - peoples.get(0) >= 0) {
//                peoples.remove(0);
//            }
//        }
        Arrays.sort(people);
        int biggestIndex = people.length - 1;
        int leastIndex = 0;
        for (int i = biggestIndex; i >= leastIndex; i--) {
            if (people[i] + people[leastIndex] > limit) {
                answer++;
                continue;
            }
            if (people[i] + people[leastIndex] <= limit) {
                leastIndex++;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Boat boat = new Boat();
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(boat.solution(people, limit));
    }
}
