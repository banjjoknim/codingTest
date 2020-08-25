package w2Stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Woo2_2Stream {

    // 시간 측정 실패
    public int[] solution(String logs) {
        int[] answer = new int[24];
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        List<Integer> timeList = new ArrayList<Integer>();
        Arrays.stream(logs.split("\n")).map(item -> item.split(" ")[1])
            .forEach(log -> {
                Calendar calendar = Calendar.getInstance();
                try {
                    calendar.setTime(sdf.parse(log));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                calendar.add(Calendar.HOUR_OF_DAY, 9);
                timeList.add(calendar.get(Calendar.HOUR_OF_DAY));
            });
        Arrays.stream(answer).forEach(item -> item = 0);
        timeList.stream().forEach(item -> answer[item] = answer[item] + 1);

        return answer;
    }

}
