package programmers_level2;

import java.util.*;
import java.util.stream.Collectors;

// 더 맵게
// 15시 55분 시작. 16시 20분 -> 유효성 검사 실패.
// 16시 34분 완료. PriorityQueue 이용. 데이터를 꺼낼때 compareTo 메소드(우선순위)를 기준으로 데이터가 빠져나온다.
public class MoreHot {
    //    public int solution(int[] scoville, int K) {
//        List<Integer> scovilles = Arrays.stream(scoville)
//                .boxed()
//                .sorted()
//                .collect(Collectors.toList());
//
//        int count = 0;
//        while (true) {
//            if (scovilles.size() == 1 && scovilles.get(0) < K) {
//                return -1;
//            }
//            if (scovilles.stream()
//                    .allMatch(scale -> scale >= K)) {
//                break;
//            }
//            scovilles.add(scovilles.get(0) + (scovilles.get(1) * 2));
//            scovilles.remove(0);
//            scovilles.remove(0);
//            Collections.sort(scovilles);
//            count++;
//        }
//
//        return count;
//    }
    public int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toList()));
        int count = 0;
        while (queue.peek() < K) {
            if (queue.size() == 1 && queue.peek() < K) {
                return -1;
            }
            count++;
            queue.offer((queue.poll() + (queue.poll() * 2)));
        }
        return count;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        MoreHot moreHot = new MoreHot();
        System.out.println(moreHot.solution(scoville, 7));
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(1);
        queue1.offer(3);
        queue1.offer(5);
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
    }
}
