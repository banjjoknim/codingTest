package programmers_level1;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 19시 시작 19시 5분 완료.
public class SortArrayDown {
    public String solution(String s) {
        // char[] chars = s.toCharArray();
        // Arrays.sort(chars);
        // return new StringBuilder(new String(chars)).reverse().toString();

        // List<Character> characters = new ArrayList<>();
        // for (char c : s.toCharArray()) {
        //     characters.add(c);
        // }
        // Collections.sort(characters, Collections.reverseOrder());
        // return characters.stream().map(character -> String.valueOf(character)).collect(Collectors.joining());

        return Stream.of(s.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "aKslCkdmalksZ";
        SortArrayDown sortArrayDown = new SortArrayDown();
        System.out.println(sortArrayDown.solution(s));
    }
}
