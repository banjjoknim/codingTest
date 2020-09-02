package w1Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 23시 36분 시작. 23시 54분까지 작업.
// 01시 26분 작업재개. 01시 44분 완료
public class Q7 {
    public String solution(String cryptogram) {

        final String[] answer = {""};
        List<String> list = new ArrayList<String>();
        Arrays.stream(cryptogram.split("")).forEach(s -> list.add(s));
        boolean check = true;

        while (check) {
            check = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).equals(list.get(i + 1))) {
                    list.remove(i + 1);
                    list.remove(i);
                    check = true;
                }
            }
        }
        list.stream().forEach(s -> answer[0] += String.valueOf(s));
        return answer[0];
    }
}
