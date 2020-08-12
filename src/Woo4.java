import java.util.ArrayList;
import java.util.List;

public class Woo4 {
    // 12시 13분 시작. 1시 10분 완료.
    public boolean[] solution(String[] infos, String[] actions) {

        List<String> idList = new ArrayList<String>();
        List<String> passwordList = new ArrayList<String>();
        List<String> actionList = new ArrayList<String>();
        boolean[] answer = new boolean[actions.length];

        for (int i = 0; i < infos.length; i++) {
            idList.add(infos[i].split(" ")[0]);
            passwordList.add(infos[i].split(" ")[1]);
        }

        for (int i = 0; i < actions.length; i++) {
            actionList.add(actions[i]);
        }

        boolean loginCheck = false;
        boolean addCheck = false;

        for (int i = 0; i < actions.length; i++) {
            if (actionList.get(i).split(" ")[0].equals("LOGIN")) {
                if (loginCheck == true) {
                    answer[i] = false;
                    continue;
                }
                for (int j = 0; j < idList.size(); j++) {

                    if (actionList.get(i).split(" ")[1].equals(idList.get(j))
                            && actionList.get(i).split(" ")[2].equals(passwordList.get(j))) {
                        loginCheck = true;
                        answer[i] = true;
                        break;
                    }

                }
            }
            if (actionList.get(i).split(" ")[0].equals("ADD")) {
                if (loginCheck == true) {
                    answer[i] = true;
                    addCheck = true;
                    continue;
                }
            }
            if (actionList.get(i).split(" ")[0].equals("ORDER")) {
                if (addCheck == true) {
                    answer[i] = true;
                    addCheck = false;
                    continue;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] infos = {"kim password", "lee abc"};
        String[] actions = {"ADD 30", "LOGIN kim abc", "LOGIN lee password", "LOGIN kim password",
                "LOGIN kim password", "ADD 30", "ORDER", "ORDER", "ADD 40", "ADD 50"};

        boolean[] answer = new boolean[actions.length];
        Woo4 woo4 = new Woo4();
        answer = woo4.solution(infos, actions);

        for (int i = 0; i < actions.length; i++) {
            System.out.println(answer[i]);
        }

    }

}
