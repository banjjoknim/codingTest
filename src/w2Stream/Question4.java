package w2Stream;

import java.util.stream.IntStream;

// 02시 40분 시작 03시 05분 완료
public class Question4 {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        final boolean[] addCheck = {false};
        final boolean[] loginCheck = {false};
        // for (int i = 0; i < actions.length; i++) {
        //     if (actions[i].contains("LOGIN")) {
        //         if (loginCheck == false) {
        //             for (int j = 0; j < infos.length; j++) {
        //                 if (actions[i].contains(infos[j])) {
        //                     answer[i] = true;
        //                     loginCheck = true;
        //                     break;
        //                 } else {
        //                     answer[i] = false;
        //                 }
        //             }
        //         } else {
        //             answer[i] = false;
        //         }
        //     }
        //     if (actions[i].contains("ADD")) {
        //         if (loginCheck == true) {
        //             answer[i] = true;
        //             addCheck = true;
        //         } else {
        //             answer[i] = false;
        //         }
        //     }
        //     if (actions[i].contains("ORDER") && addCheck == true) {
        //         answer[i] = true;
        //         addCheck = false;
        //     }
        // }

        IntStream.range(0, actions.length).forEach(index -> {
            if (actions[index].contains("LOGIN")) {
                if (loginCheck[0] == false) {
                    for (int j = 0; j < infos.length; j++) {
                        if (actions[index].contains(infos[j])) {
                            answer[index] = true;
                            loginCheck[0] = true;
                            break;
                        } else {
                            answer[index] = false;
                        }
                    }
                }
                if (loginCheck[0] == true) {
                    answer[index] = false;
                }
            }
            if (actions[index].contains("ADD")) {
                if (loginCheck[0] == true) {
                    answer[index] = true;
                    addCheck[0] = true;
                } else {
                    answer[index] = false;
                }
            }
            if (actions[index].contains("ORDER") && addCheck[0] == true) {
                answer[index] = true;
                addCheck[0] = false;
            }
        });

        return answer;
    }
}
