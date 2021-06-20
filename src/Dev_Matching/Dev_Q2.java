package Dev_Matching;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 1. 문자열을 날짜로 변경
// 2. n초 만큼 더한 날짜로 변경
// 3. 24시간 형태인 날짜미 문자열로 변경
// 14시 시작 14시 45분 완료.
// SimpleDateFormat 공부할 것.
public class Dev_Q2 {
    SimpleDateFormat simpleDateFormat12 = new SimpleDateFormat("a hh:mm:ss");
    SimpleDateFormat simpleDateFormat24 = new SimpleDateFormat("HH:mm:ss");

    public String solution(String p, int n) throws ParseException {
        if (p.split(" ")[0].equals("PM")) {
            p = "오후 " + p.split(" ")[1];
        }
        if (p.split(" ")[0].equals("AM")) {
            p = "오전 " + p.split(" ")[1];
        }
        Date date = simpleDateFormat12.parse(p);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeInMillis(calendar.getTimeInMillis() + n * 1000);

        return simpleDateFormat24.format(calendar.getTime());
    }

    public static void main(String[] args) throws ParseException {
        Dev_Q2 dev_q2 = new Dev_Q2();
        System.out.println(dev_q2.solution("PM 01:00:00", 10));
        ;
    }
}
