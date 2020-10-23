package BackJoon;

import java.util.Calendar;
import java.util.Scanner;

// 2007년
// 5분?
public class BackJoon1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int x = sc.nextInt();
        int y = sc.nextInt();
        calendar.set(2007, x - 1, y);
        System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
