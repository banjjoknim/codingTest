package Dev_Matching;

import java.util.*;

// 14시 50분 시작 15시 46분 완료.
// 1. 자동차별 표 계산
// 2. 득표 수별로 정렬, 만약 득표 수가 같다면 알파벳 사전식 순서로 정렬.
// 3. 사전식 정렬뒤, 뒤쪽에 있는 자동차부터 제거
// 4. 탈락시키는 자동차 득표수 합이 상위 순위 k개 자동차의 득표수 합보다 작을때까지만 반복
public class Dev_Q1 {
    public String solution(String[] votes, int k) {
        List<Car> cars = new ArrayList<>();
        List<String> names = Arrays.asList(votes);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
            if (!map.containsKey(name)) {
                map.put(name, 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            cars.add(new Car(next.getKey(), next.getValue()));
        }

        Collections.sort(cars);

        int score = 0;
        for (int i = 0; i < k; i++) {
            score += cars.get(i).count;
        }

        int removeCarScore = 0;
        int index = cars.size();
        while (score > removeCarScore) {
            index--;
            removeCarScore += cars.get(index).count;
        }
        return cars.get(index+1).name;
    }

    class Car implements Comparable<Car> {
        public Car(String name, int count) {
            this.name = name;
            this.count = count;
        }

        private String name;
        private int count;

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Car o) {
            if (this.count == o.count) {
                return this.name.compareTo(o.name);
            }
            return -Integer.compare(this.count, o.count);
        }
    }

    public static void main(String[] args) {
        String[] votes = {"AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL", "AVANT", "SANTA"};
        Dev_Q1 dev_q1 = new Dev_Q1();
        System.out.println(dev_q1.solution(votes, 2));
    }
}
