package w2Stream;

// 02시 40분 시작 03시 05분 완료
public class Woo2_4Stream {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        boolean addCheck = false;
        boolean loginCheck = false;
        for (int i = 0; i < actions.length; i++) {
            if (actions[i].contains("LOGIN")) {
                if (loginCheck == false) {
                    for (int j = 0; j < infos.length; j++) {
                        if (actions[i].contains(infos[j])) {
                            answer[i] = true;
                            loginCheck = true;
                            break;
                        } else {
                            answer[i] = false;
                        }
                    }
                } else {
                    answer[i] = false;
                }
            }
            if (actions[i].contains("ADD")) {
                if (loginCheck == true) {
                    answer[i] = true;
                    addCheck = true;
                } else {
                    answer[i] = false;
                }
            }
            if (actions[i].contains("ORDER") && addCheck == true) {
                answer[i] = true;
                addCheck = false;
            }
        }
        // IntStream.range(0, actions.length).forEach(index -> {
        //     if (actions[index].contains("LOGIN")) {
        //         if (loginCheck == false) {
        //             for (int j = 0; j < infos.length; j++) {
        //                 if (actions[index].contains(infos[j])) {
        //                     answer[index] = true;
        //                     loginCheck = true;
        //                     break;
        //                 } else {
        //                     answer[index] = false;
        //                 }
        //             }
        //         } else {
        //             answer[index] = false;
        //         }
        //     }
        //     if (actions[index].contains("ADD")) {
        //         if (loginCheck == true) {
        //             answer[index] = true;
        //             addCheck = true;
        //         } else {
        //             answer[index] = false;
        //         }
        //     }
        //     if (actions[index].contains("ORDER") && addCheck == true) {
        //         answer[index] = true;
        //         addCheck = false;
        //     }
        // });

        // IntStream.range(0, actions.length).filter(index -> actions[index].contains("LOGIN"))
        //     .forEach(index -> {
        //         if (loginCheck[0] == true) {
        //             answer[index] = false;
        //         } else {
        //             for (int i = 0; i < infos.length; i++) {
        //                 if (actions[index].contains(infos[index])) {
        //                     answer[index] = true;
        //                     loginCheck[0] = true;
        //                     break;
        //                 } else {
        //                     answer[index] = false;
        //                 }
        //             }
        //         }
        //     });
        // IntStream.range(0, actions.length).filter(index -> actions[index].contains("ADD"))
        //     .forEach(index -> {
        //         if (loginCheck[0] == true) {
        //             answer[index] = true;
        //             addCheck[0] = true;
        //         } else {
        //             answer[index] = false;
        //         }
        //     });
        // IntStream.range(0, actions.length).filter(index -> actions[index].contains("ORDER"))
        //     .forEach(index -> {
        //         if (addCheck[0] == true) {
        //             answer[index] = true;
        //             addCheck[0] = false;
        //         } else {
        //             answer[index] = false;
        //         }
        //     });

        return answer;
    }
}
