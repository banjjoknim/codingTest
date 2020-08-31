package w2Stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

// 02시 40분 시작 03시 05분 완료
public class Question4 {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        final boolean[] addCheck = {false};
        final boolean[] loginCheck = {false};

        Predicate<String> login = s -> s.contains("LOGIN");
        Predicate<String> add = s -> s.contains("ADD");
        Predicate<String> order = s -> s.contains("ORDER");

        IntStream.range(0, actions.length).forEach(index -> {
            if (login.test(actions[index])) {
                loginCheck(infos, actions, answer, loginCheck, login, index);
                return;
            }
            if (add.test(actions[index])) {
                addCheck(answer, addCheck, loginCheck, index);
                return;
            }
            if (order.test(actions[index]) && addCheck[0] == true) {
                orderCheck(answer, addCheck, index);
                return;
            }
        });

        return answer;
    }

    private void orderCheck(boolean[] answer, boolean[] addCheck, int index) {
        if (addCheck[0] == true) {
            answer[index] = true;
            addCheck[0] = false;
        } else {
            answer[index] = false;
        }
        return;
    }

    private void addCheck(boolean[] answer, boolean[] addCheck, boolean[] loginCheck, int index) {
        if (loginCheck[0] == true) {
            answer[index] = true;
            addCheck[0] = true;
            return;
        } else {
            answer[index] = false;
        }
    }

    private void loginCheck(String[] infos, String[] actions, boolean[] answer, boolean[] loginCheck,
        Predicate<String> login, int index) {
        if (loginCheck[0] == false) {
            if (Arrays.stream(infos).anyMatch(info -> actions[index].contains(info))) {
                answer[index] = true;
                loginCheck[0] = true;
            }
        } else {
            answer[index] = false;
        }
    }

}
