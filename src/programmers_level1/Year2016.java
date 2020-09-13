package programmers_level1;

import java.util.Calendar;

// 15시 30분 시작 15시 46분 완료.
public class Year2016 {
    public String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a - 1, b);
        return day[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        Year2016 year2016 = new Year2016();
        System.out.println(year2016.solution(5, 24));
    }
}
