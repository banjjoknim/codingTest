package BackJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// 트럭
// 실버 1
// 1시간 소요.
public class BackJoon13335 {
    public static int time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();

        Queue<Truck> bridge = new LinkedList<>();
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trucks.add(new Truck(0, sc.nextInt()));
        }

        while (!trucks.isEmpty()) {
            time++;

            if (!bridge.isEmpty()) {
                for (Truck truck : bridge) {
                    truck.move();
                }
                if (bridge.peek().position == w) {
                    bridge.poll();
                }
            }

            int totalWeight = bridge.stream()
                .mapToInt(Truck::getWeight)
                .sum();
            if (trucks.get(0).weight <= L - totalWeight) {
                Truck truck = trucks.remove(0);
                bridge.offer(truck);
                continue;
            }
        }
        time += w;
        System.out.println(time);
    }

    static class Truck {
        private int position;
        private int weight;

        public Truck(int position, int weight) {
            this.position = position;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        private void move() {
            this.position++;
        }
    }
}
