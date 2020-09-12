package Kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String new_id) {
        String answer = "";

        int index = new_id.toCharArray().length;
        List<Character> new_idChars = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            char c = new_id.toCharArray()[i];
            if (c >= 'A' && c <= 'z') {
                new_idChars.add(Character.toLowerCase(c));
            } else {
                new_idChars.add(c);
            }
        }
        List<Character> restrictions = new ArrayList<>();
        restrictions.add('_');
        restrictions.add('.');
        restrictions.add('-');
        List<Character> characters = new_idChars.stream()
            .filter(character -> restrictions.contains(character) || (character >= 'a' && character <= 'z') || (
                character >= 48 && character <= 57))
            .collect(Collectors.toList());
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < characters.size() - 1; i++) {
                if (characters.get(i) == '.' && characters.get(i + 1) == '.') {
                    characters.remove(i);
                    check = true;
                }
            }
        }
        System.out.println(characters.toString());
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(0) == '.') {
                characters.remove(0);
                continue;
            }
            break;
        }
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(characters.size() - 1) == '.') {
                characters.remove(characters.size() - 1);
                continue;
            }
            break;
        }
        if (characters.size() == 0) {
            characters.add('a');
        }
        if (characters.size() > 15) {
            characters = characters.stream().limit(15).collect(Collectors.toList());
            while (characters.get(characters.size() - 1) == '.') {
                characters.remove(characters.size() - 1);
            }

        }
        if (characters.size() < 3) {
            while (characters.size() < 3) {
                characters.add(characters.get(characters.size() - 1));
            }
            System.out.println(characters.toString());
        }
        answer = characters.stream().map(character -> String.valueOf(character)).collect(Collectors.joining());
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String new_id = "abcdefghijklmn.p";
        System.out.println(solution.solution(new_id));
    }
}

public class Question1 {
}
