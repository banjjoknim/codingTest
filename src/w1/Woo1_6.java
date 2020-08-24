package w1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

// 1회차. 01시 20분 시작. 01시 52분 종료. 실패.
// 2회차. 16시 시작. 16시 48분 완료.
//접속 시도를 하면 request 로그가 남고 접속 후 1분 이내 접속을 종료하면 leave 로그가 남는다.
//이미 한 유저가 접속한 상태라면 다른 유저들은 접속을 할 수 없으며 다시 접속을 시도해야한다.
//티켓을 구매하기 위해서는 서버 접속 후 1분을 유지해야한다.
//티켓 구매를 성공한 유저는 접속은 가능하지만 다시 구매는 할 수 없다.
public class Woo1_6 {
    public String[] solution(int totalTicket, String[] logs) throws ParseException {

        String[] answer = {};
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        boolean login = true;
        List<String> answerList = new ArrayList<String>();
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].contains("request")) {
                login = true;
                for (int j = 0; j < i; j++) {
                    calendar.setTime(sdf.parse(logs[i].split(" ")[2]));
                    calendar1.setTime(sdf.parse(logs[j].split(" ")[2]));
                    if ((calendar.getTimeInMillis() - calendar1.getTimeInMillis()) / (1000 * 60) < 1) {
                        login = false;
                        break;
                    } else {
                        login = true;
                    }
                }
            }
            if (logs[i].contains("leave")) {
                login = false;
                answerList.remove(logs[i].split(" ")[0]);
            }
            if (login == true) {
                answerList.add(logs[i].split(" ")[0]);
            }
        }
        answer = answerList.toArray(new String[answer.length]);
        Arrays.sort(answer);

        return answer;

    }

}
