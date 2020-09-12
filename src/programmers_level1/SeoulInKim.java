package programmers_level1;

// 금방 풀었음..
public class SeoulInKim {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"jane", "Kim"};
        SeoulInKim seoulInKim = new SeoulInKim();
        System.out.println(seoulInKim.solution(seoul));
    }
}
