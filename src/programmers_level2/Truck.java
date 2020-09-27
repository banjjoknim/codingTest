package programmers_level2;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭
// 결국 풀이보고 하였음.
public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int[] endTime = new int[truck_weights.length];

        Queue<Integer> onBridge = new LinkedList<Integer>();
        int time = 0, cur = 0;
        while (true) {
            // 도착한 트럭 제거
            if (!onBridge.isEmpty() && endTime[onBridge.peek()] == time) {
                weight += truck_weights[onBridge.poll()];
            }

            // 대기하는 트럭 추가
            if (cur < truck_weights.length && truck_weights[cur] <= weight) {
                onBridge.add(cur);
                endTime[cur] = time + bridge_length;
                weight -= truck_weights[cur];
                cur++;
            }

            time++;
            if (onBridge.isEmpty()) {
                break;
            }
        }
        return time;
    }

    // public static void main(String[] args) {
    //     Queue<Integer> queue = new LinkedList<>();
    //     queue.add();
    //     queue.poll();
    //     queue.peek();
    //     queue.remove();
    //     queue.offer();
    //
    // }
}
