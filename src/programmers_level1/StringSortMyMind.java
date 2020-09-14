package programmers_level1;

import java.util.*;
import java.util.stream.Stream;

// 문자열 내 마음대로 정렬하기
// 15시 04분 시작 15시 34분 완료.
public class StringSortMyMind {
    public String[] solution(String[] strings, int n) {
        char[] chars = new char[strings.length];
        List<Word> words = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].charAt(n);
            words.add(new Word(chars[i], strings[i]));
        }
        Collections.sort(words);

//        return words.stream()
//                .map(word -> word.word)
//                .toArray(size -> new String[size]);
        return words.stream()
                .map(word -> word.word)
                .toArray(String[]::new);

        // 다른 사람 풀이 인덱스의 문자열을 맨앞에 붙여준 뒤 정렬.
//        String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;

    }

    class Word implements Comparable<Word> {
        private char character;
        private String word;

        public Word(char character, String word) {
            this.character = character;
            this.word = word;
        }

        @Override
        public int compareTo(Word o) {
            if (this.character > o.character) {
                return 1;
            }
            if (this.character < o.character) {
                return -1;
            }
            if (this.character == o.character) {
                return this.word.compareTo(o.word);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        StringSortMyMind stringSortMyMind = new StringSortMyMind();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        Arrays.stream(stringSortMyMind.solution(strings, n)).forEach(System.out::println);

        Stream<String> stringStream = Stream.of("a", "b", "c");
        String[] stringArray = stringStream.toArray(size -> new String[size]);
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
