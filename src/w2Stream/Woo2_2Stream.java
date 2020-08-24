package w2Stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Woo2_2Stream {

    // 시간 측정 실패
    public int[] solution(String logs) throws ParseException {
        int[] answer = {};
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        // logs = "2019/05/01 00:59:19\n2019/06/01 01:35:20\n2019/08/01 02:01:22\n2019/08/01 02:01:23\n2019/08/02 03:02:35\n2019/10/03 04:05:40\n2019/10/04 06:23:10\n2019/10/10 08:23:20\n2019/10/12 08:42:24\n2019/10/23 08:43:26\n2019/11/14 08:43:29\n2019/11/01 10:19:02\n2019/12/01 11:23:10";
        String[] logsArray = logs.split("\n");
        List<String> logList = new ArrayList<String>();
        List<Integer> timeList = new ArrayList<Integer>();
        logList = Arrays.stream(logsArray).map(item -> item.split(" ")[1]).collect(Collectors.toList());
        for (int i = 0; i < logList.size(); i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(logList.get(i)));
            calendar.add(Calendar.HOUR_OF_DAY, 9);
            timeList.add(calendar.get(Calendar.HOUR_OF_DAY));
        }
        answer = new int[24];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }
        for (int i = 0; i < timeList.size(); i++) {
            answer[timeList.get(i)] = answer[timeList.get(i)] + 1;
        }
        return answer;
    }

}
