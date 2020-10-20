package programmers_level2;

// 점프와 순간 이동
// 16시 03분 시작 16시 23분 완료
// 순간이동은 건전지가 사용되지않음. 점프는 건전지가 사용됨.
// 한번에 k칸을 점프하거나 현재까지 온 거리 *2에 해당하는 위치로 순간이동 가능
public class JumpAndTeleport {
    public int solution(int n) {
        int count = 0;

        // 1이 될때까지 계속 나눈다.
        while (n != 1) {
            // 홀수라면 1칸을 점프하여 짝수로 만든다.(순간이동 하기위해)
            if (n % 2 != 0) {
                n = (n - 1) / 2;
                count++;
                continue;
            }
            n = n / 2;
        }
        // 최초의 1이 되기위해서 1만큼 점프해야 하므로 +1 한다.
        return count + 1;
    }

    public static void main(String[] args) {
        JumpAndTeleport jumpAndTeleport = new JumpAndTeleport();
        System.out.println(jumpAndTeleport.solution(5000));
        System.out.println(Integer.toBinaryString(5000));
    }
}
