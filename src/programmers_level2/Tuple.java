package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 튜플
// 23시 36분 시작. 00시 08분 완료.
public class Tuple {

    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b) -> {
            return a.length() - b.length();
        });
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            for (String s2 : s1.split(",")) {
                if (set.add(s2))
                    answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }

    public int[] solution(String s) {
        String newS = s.replaceAll("\\{", "").replaceAll("},", " ").replaceAll("}", "");
        String[] strings = newS.split(" ");
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].split(","));
        }

        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });

        Set<Integer> set = new HashSet<>();
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length; j++) {
                Integer number = Integer.valueOf(list.get(i)[j]);
                if (set.add(number)) {
                    answer[i] = number;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Tuple tuple = new Tuple();
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(tuple.solution(s)));
    }
}
