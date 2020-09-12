package programmers_level1;

// 23시 15분 시작 23시 20분 완료
public class PAndYCount {
    boolean solution(String s) {
        s = s.toLowerCase();
        // if (s.indexOf("p") == -1 && s.indexOf("y") == -1) {
        //     return true;
        // }
        // int pCount = (int) Arrays.stream(s.split("")).filter(word -> word.equals("p")).count();
        // int yCount = (int) Arrays.stream(s.split("")).filter(word -> word.equals("y")).count();
        // if (pCount == yCount) {
        //     return true;
        // } else {
        //     return false;
        // }
        return s.chars().filter(word -> word == 'p').count() == s.chars().filter(word -> word == 'y').count();
    }
}
