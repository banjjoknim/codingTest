package Woo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

// 30분 걸림.
public class Woo1Q6 {
    public String[] solution(int totalTicket, String[] logs) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        List<String> successUsers = new ArrayList<>();

        Calendar lastTime = Calendar.getInstance();
        lastTime.setTime(sdf.parse("08:59:00"));

        for (int i = 0; i < logs.length; i++) {
            String user = logs[i].split(" ")[0];
            String action = logs[i].split(" ")[1];
            Calendar nowTime = Calendar.getInstance();
            nowTime.setTime(sdf.parse(logs[i].split(" ")[2]));
            if ("request".equals(action)
                && Math.abs((nowTime.getTimeInMillis() - lastTime.getTimeInMillis())) / 1000 >= 60) {
                lastTime = nowTime;
                if (successUsers.size() < totalTicket && !successUsers.contains(user)) {
                    successUsers.add(user);
                }
                continue;
            }
            if ("leave".equals(action)) {
                if (successUsers.contains(user)) {
                    successUsers.remove(user);
                    continue;
                }
            }
        }

        return successUsers.stream()
            .sorted()
            .toArray(String[]::new);
    }

    public static void main(String[] args) throws ParseException {
        Woo1Q6 woo1Q6 = new Woo1Q6();
        String[] logs = new String[] {"woni request 09:12:29", "brown request 09:23:11", "brown leave 09:23:44",
            "jason request 09:33:51", "jun request 09:33:56", "cu request 09:34:02"};
        System.out.println(Arrays.toString(woo1Q6.solution(2000, logs)));
    }
}
