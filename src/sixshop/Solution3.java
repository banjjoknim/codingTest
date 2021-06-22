package sixshop;

public class Solution3 {
    public int solution(int n) {
        int answer = 0;
        while (n % 5 != 0) {
            n = n - 3;
            answer++;
            if (n < 0) {
                return -1;
            }
        }
        answer += n / 5;
        return answer;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(11));
    }
}
