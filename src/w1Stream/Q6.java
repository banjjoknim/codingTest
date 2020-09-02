package w1Stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// 00시 26분 시작 00시 55분 완료. (순수 문제 푸는 시간)
public class Q6 {
    public String[] solution(String[] logs) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < logs.length; i++) {
            boolean requestCheck;
            if (logs[i].contains("request")) {
                int now = i;
                requestCheck = IntStream.range(0, now)
                    .filter(index -> logs[index].contains("request"))
                    .noneMatch(index -> diffSecondsLowerThan60(logs[now], logs[index]));
                if (requestCheck) {
                    list.add(logs[i].split(" ")[0]);
                }
            }
        }
        Arrays.stream(logs)
            .filter(log -> log.contains("leave"))
            .forEach(log -> list.remove(log.split(" ")[0]));
        Collections.sort(list);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }

    private boolean diffSecondsLowerThan60(String logNow, String logBefore) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            return sdf.parse(logNow.split(" ")[2]).getTime() - sdf.parse(logBefore.split(" ")[2]).getTime() < 60 * 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}

