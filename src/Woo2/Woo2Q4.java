package Woo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 30분 걸림
public class Woo2Q4 {
    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];
        boolean isLogin = false;
        String idAndPw = "NOT";
        List<String> orders = new ArrayList<>();
        for (int i = 0; i < actions.length; i++) {
            if (isLogin && actions[i].contains("LOGIN")) {
                answer[i] = false;
                continue;
            }
            if (!isLogin) {
                if (actions[i].contains("LOGIN")) {
                    idAndPw = actions[i].substring(6);
                    isLogin = isLogined(idAndPw, infos);
                    answer[i] = isLogin;
                    continue;
                }
                answer[i] = false;
                continue;
            }
            if (actions[i].contains("ADD")) {
                answer[i] = true;
                orders.add(actions[i].split(" ")[1]);
                continue;
            }
            answer[i] = canOrder(orders);
        }
        return answer;
    }

    private boolean isLogined(String idAndPw, String[] infos) {
        return Arrays.stream(infos).anyMatch(info -> info.contains(idAndPw));
    }

    private boolean canAdd(String idAndPw, String[] infos) {
        if (isLogined(idAndPw, infos)) {
            return true;
        }
        return false;
    }

    private boolean canOrder(List<String> orders) {
        if (orders.isEmpty()) {
            return false;
        }
        orders.clear();
        return true;
    }

    public static void main(String[] args) {
        String[] infos = {"kim password", "lee abc"};
        String[] actions = {"ADD 30",
                "LOGIN kim abc",
                "LOGIN lee password",
                "LOGIN kim password",
                "LOGIN kim password",
                "ADD 30",
                "ORDER",
                "ORDER",
                "ADD 40",
                "ADD 50"};
        Woo2Q4 woo2Q4 = new Woo2Q4();
        System.out.println(Arrays.toString(woo2Q4.solution(infos, actions)));
    }
}
