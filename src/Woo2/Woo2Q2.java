package Woo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

// 11분 걸림.
public class Woo2Q2 {
    public int[] solution(String logs) throws ParseException {
        int[] answer = new int[24];
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD hh:mm:ss");
        String[] logArr = logs.split("\n");
        for (int i = 0; i < logArr.length; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(logArr[i]));
            cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) + 9);
            answer[cal.get(Calendar.HOUR_OF_DAY)]++;
        }
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        String s = "2019/05/01 00:59:19\n"
            + "2019/06/01 01:35:20\n"
            + "2019/08/01 02:01:22\n"
            + "2019/08/01 02:01:23\n"
            + "2019/08/02 03:02:35\n"
            + "2019/10/03 04:05:40\n"
            + "2019/10/04 06:23:10\n"
            + "2019/10/10 08:23:20\n"
            + "2019/10/12 08:42:24\n"
            + "2019/10/23 08:43:26\n"
            + "2019/11/14 08:43:29\n"
            + "2019/11/01 10:19:02\n"
            + "2019/12/01 11:23:10";
        Woo2Q2 woo2Q2 = new Woo2Q2();
        System.out.println(Arrays.toString(woo2Q2.solution(s)));
    }
}
