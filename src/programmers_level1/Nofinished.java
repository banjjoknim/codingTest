package programmers_level1;

import java.util.Arrays;

/*
 * 2020.09.11 03:52 시작. 05:03 완료
 *
 **/
public class Nofinished {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        answer = participant[participant.length - 1];
        return answer;
    }
}
