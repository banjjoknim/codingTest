import java.util.ArrayList;
import java.util.List;

public class Woo1_7 {
    // 02:24 시작. 02:52 완료
    public String solution(String cryptogram) {
        String result = "";
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < cryptogram.toCharArray().length; i++) {
            list.add(cryptogram.toCharArray()[i]);
        }

        int count = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            while (list.size() != 0 && list.get(i).compareTo(list.get(i + 1)) == 0) {
                if (list.get(i).equals(list.get(i + 1))) {
                    list.remove(i);
                    list.remove(i);
                    i = 0;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            result += Character.toString(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Woo1_7 woo1_7 = new Woo1_7();
        woo1_7.solution("zyelleyz");
        woo1_7.solution("browoanoommnaon");

    }
}
