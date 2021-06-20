package programmers_level1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 19시 35분 시작 19시 38분 완료
public class PhoneNumberHide {
    public String solution(String phone_number) {
        int length = phone_number.length();
        return Arrays.stream(phone_number.split(""))
                .limit(length - 4)
                .map(number -> "*")
                .collect(Collectors.joining()).concat(phone_number.substring(length - 4, length));
    }

}
