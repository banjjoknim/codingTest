package w2Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Woo2_4StreamTest {

    @Test
    public void test() {
        Woo2_4Stream woo2_4Stream = new Woo2_4Stream();
        String[] infos = {"kim password", "lee abc"};
        String[] actions = {
            "ADD 30",
            "LOGIN kim abc",
            "LOGIN lee password",
            "LOGIN kim password",
            "LOGIN kim password",
            "ADD 30",
            "ORDER",
            "ORDER",
            "ADD 40",
            "ADD 50"
        };
        System.out.println(actions[3].contains(infos[0]));
        boolean[] answer = new boolean[] {false, false, false, true, false, true, true, false, true, true};
        Assertions.assertArrayEquals(answer, woo2_4Stream.solution(infos, actions));

    }

}
