package programmers_level1;

// 15시 7분 시작 15시 16분 완료.
public class BasicString {
    public boolean solution(String s) {
        // boolean check = s.chars()
        //     .allMatch(character -> character >= 48 && character <= 57);
        // if (check && (s.length() == 4 || s.length() == 6)) {
        //     return true;
        // }
        // return false;
        try {
            int x = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "a234";
        BasicString basicString = new BasicString();
        System.out.println(basicString.solution(s));

    }
}
