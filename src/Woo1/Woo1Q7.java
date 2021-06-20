package Woo1;

// 5분 컷...
public class Woo1Q7 {
    public String solution(String cryptogram) {
        StringBuilder sb = new StringBuilder();

        // for (char word : cryptogram.toCharArray()) {
        //     if (sb.length() == 0) {
        //         sb.append(word);
        //         continue;
        //     }
        //     if (sb.toString().charAt(sb.length() - 1) == word) {
        //         sb.deleteCharAt(sb.length() - 1);
        //         continue;
        //     }
        //     sb.append(word);
        //     continue;
        // }

        cryptogram.chars()
                .mapToObj(number -> (char) (number))
                .forEach(word -> change(word, sb));

        return sb.toString();
    }

    private static void change(char word, StringBuilder sb) {
        if (sb.length() == 0) {
            sb.append(word);
            return;
        }
        if (sb.toString().charAt(sb.length() - 1) == word) {
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(word);
    }

    public static void main(String[] args) {
        Woo1Q7 woo1Q7 = new Woo1Q7();
        System.out.println(woo1Q7.solution("browoanoommnaon"));
        System.out.println(woo1Q7.solution("zyelleyz"));
    }
}
