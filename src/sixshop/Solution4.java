package sixshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution4 {

    class CoffeeMachine {
        private List<Coffee> orderedCoffees;
        private List<Coffee> makingCoffees = new ArrayList<>();
        private List<Coffee> completedCoffees = new ArrayList<>();
        private int size;

        public CoffeeMachine(int size, List<Coffee> orderedCoffees) {
            this.size = size;
            this.orderedCoffees = orderedCoffees;
        }

        boolean isEnd() {
            return makingCoffees.size() == 0 && orderedCoffees.size() == 0;
        }

        void timeGoesOn() {
            makingCoffees.forEach(Coffee::passOneTime);
        }

        void fill() {
            if (orderedCoffees.size() == 0 || makingCoffees.size() == size) {
                return;
            }
            int canFillSize = size - makingCoffees.size();
            for (int i = 0; i < canFillSize; i++) {
                makingCoffees.add(orderedCoffees.get(i));
            }
            int fillCount = Math.min(canFillSize, orderedCoffees.size());
            for (int i = 0; i < fillCount; i++) {
                orderedCoffees.remove(0);
            }
        }

        void getOffCoffees() {
            List<Coffee> nowCompletedCoffees = new ArrayList<>();
            for (Coffee coffee : makingCoffees) {
                if (coffee.isComplete()) {
                    nowCompletedCoffees.add(coffee);
                }
            }
            makingCoffees.removeIf(Coffee::isComplete);
            Collections.sort(nowCompletedCoffees);
            completedCoffees.addAll(nowCompletedCoffees);
        }

    }

    class Coffee implements Comparable<Coffee> {
        private int orderNumber;
        private int time;

        public Coffee(int orderNumber, int time) {
            this.orderNumber = orderNumber;
            this.time = time;
        }

        boolean isComplete() {
            return time == 0;
        }

        @Override
        public int compareTo(Coffee o) {
            int compare = Integer.compare(time, o.time);
            if (compare == 0) {
                return Integer.compare(orderNumber, o.orderNumber);
            }
            return compare;
        }

        public void passOneTime() {
            time--;
        }
    }

    public int[] solution(int N, int[] coffee_times) {
        List<Coffee> orderedCoffees = new ArrayList<>();
        for (int i = 0; i < coffee_times.length; i++) {
            orderedCoffees.add(new Coffee(i, coffee_times[i]));
        }
        CoffeeMachine coffeeMachine = new CoffeeMachine(N, orderedCoffees);

        while (!coffeeMachine.isEnd()) {
            coffeeMachine.fill();
            coffeeMachine.timeGoesOn();
            coffeeMachine.getOffCoffees();
        }

        return coffeeMachine.completedCoffees.stream()
                .mapToInt(coffee -> coffee.orderNumber + 1)
                .toArray();
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] coffee_times = {4, 2, 2, 5, 3};
//        int[] coffee_times = {100, 1, 50, 1, 1};
        System.out.println(Arrays.toString(solution4.solution(3, coffee_times)));
    }
}
