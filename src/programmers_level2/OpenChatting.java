package programmers_level2;

import java.util.*;

// 오픈채팅방
// 22시 53분 시작.
// 1. 입장, 퇴장 체크 및 list 담기
// 2. 아이디별 닉네임 부여
// 3. 입장, 퇴장 list내 아이디를 닉네임으로 교체
public class OpenChatting {
    private static final String enter = "님이 들어왔습니다.";
    private static final String leave = "님이 나갔습니다.";

    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        List<String> logs = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] log = record[i].split(" ");
            if (record[i].contains("Enter")) {
                user.put(log[1], log[2]);
            }
            if (record[i].contains("Change")) {
                user.put(log[1], log[2]);
            }
        }
        for (int i = 0; i < record.length; i++) {
            String[] log = record[i].split(" ");
            if ("Enter".equals(log[0])) {
                logs.add(user.get(log[1]) + enter);
            }
            if ("Leave".equals(log[0])) {
                logs.add(user.get(log[1]) + leave);
            }
        }
        String[] answer = new String[logs.size()];
        for (int i = 0; i < logs.size(); i++) {
            answer[i] = logs.get(i);
        }
        return answer;
        // Iterator<Map.Entry<String, String>> iterator = user.entrySet().iterator();
        // while (iterator.hasNext()) {
        //     Map.Entry<String, String> next = iterator.next();
        //     for (int i = 0; i < logs.size(); i++) {
        //         String log = logs.get(i);
        //         if (log.contains(next.getKey())) {
        //             logs.set(i, next.getValue() + log.substring(log.indexOf("님")));
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        OpenChatting openChatting = new OpenChatting();
        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(openChatting.solution(record)));
    }
}
