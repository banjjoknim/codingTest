package programmers_level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NofinishedTest {

    @Test
    void test() {
        Nofinished nofinished = new Nofinished();
        String[] participant = {"mislav", "stanko", "stanko", "mislav"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "mislav";
        Assertions.assertEquals(answer, nofinished.solution(participant, completion));
    }

}
