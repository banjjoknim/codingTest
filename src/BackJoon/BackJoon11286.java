package BackJoon;

import java.util.*;

// 절댓값 힙
// 12시 7분 시작. 12시 52분 완료. 시간초과로 인해 풀이 참조하였음..
public class BackJoon11286 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int order = sc.nextInt();
//            if (order != 0) {
//                list.add(order);
//                continue;
//            }
//            if (list.isEmpty()) {
//                System.out.println(0);
//                continue;
//            }
//            Collections.sort(list, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return Math.abs(o1) - Math.abs(o2);
//                }
//            });
//            int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
//            if (list.stream().mapToInt(Math::abs).filter(number -> number == Math.abs(min)).count() > 1) {
//                Collections.sort(list);
//                System.out.println(list.remove(0));
//                continue;
//            }
//            System.out.println(list.remove(0));
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2) {
                return Integer.compare(o1, o2);
            }
            return abs1 - abs2;
        });

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                    continue;
                }
                System.out.println(queue.poll());
                continue;
            }
            queue.add(val);
        }
    }
}
