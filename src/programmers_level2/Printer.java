package programmers_level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 프린터
// 15시 시작. 15시 47분 완료.
public class Printer {
    public int solution(int[] priorities, int location) {

        int count = 0;
        List<Integer> list = Arrays.stream(priorities)
                .boxed()
                .collect(Collectors.toList());

        while (!list.isEmpty()) {
            int max = list.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .getAsInt();
            if (location == 0 && list.get(0) == max) {
                count++;
                break;
            }
            if (list.get(0) != max) {
                int first = list.get(0);
                list.remove(0);
                list.add(first);
                if (location > 0) {
                    location = location - 1;
                    continue;
                }
                if (location == 0) {
                    location = list.size() - 1;
                }
            }
            if (list.get(0) == max) {
                count++;
                list.remove(0);
                if (location > 0) {
                    location = location - 1;
                    continue;
                }
                if (location == 0) {
                    location = list.size() - 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        Printer printer = new Printer();
        System.out.println(printer.solution(priorities, location));
    }
}
