package programmers_level2;

// 조이스틱
// 22시 10분 시작. 22시 21분 중지. 00시 30분 재개.
// 1. Z 와 A 중에서 더 차이가 적은쪽으로부터 조이스틱 조작.
public class Joystick {
    public int solution(String name) {

        // 1. 위, 아래 최소 이동
        int ans = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                int up = name.charAt(i) - 'A';
                int down = 1 + 'Z' - name.charAt(i);
                if (up > down) {
                    ans += down;
                    continue;
                }
                ans += up;
            }
        }

        // 2. A 아닌 모든 문자를 들릴 수 있는 최소 좌우 이동
        // 모든 위치에서 역으로 돌아가는 경우 최소를 찾는다.
        int minMove = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            // if (name.charAt(i) != 'A') {
            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            int move = 2 * i + name.length() - next;
            minMove = Math.min(move, minMove);
            // }
        }

        return ans + minMove;
    }

    public static void main(String[] args) {
        String name = "JAZZ";
        Joystick joystick = new Joystick();
        System.out.println(joystick.solution(name));
    }
}
