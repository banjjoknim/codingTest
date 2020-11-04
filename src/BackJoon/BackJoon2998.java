package BackJoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 8진수
// 실버 5
// 15분..
public class BackJoon2998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        StringBuilder sb = new StringBuilder(number);
        while (sb.toString().length() % 3 != 0) {
            sb.insert(0, 0);
        }

        System.out.println(sb.toString());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < sb.toString().length() / 3; i++) {
            StringBuilder sb2 = new StringBuilder();
            for (int j = i * 3; j < (i + 1) * 3; j++) {
                sb2.append(sb.toString().charAt(j));
            }
            list.add(sb2.toString());
        }

        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        map.put("000", 0);
        map.put("001", 1);
        map.put("010", 2);
        map.put("011", 3);
        map.put("100", 4);
        map.put("101", 5);
        map.put("110", 6);
        map.put("111", 7);

        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(map.get(s));
        }

        System.out.println(answer.toString());
    }
}
