package programmers_level2;

// 타겟 넘버
// 풀이 보고 풀었음..
public class TargetNumber {

    // public int dfs(int prev, int index, int[] numbers, int target) {
    //     if (index >= numbers.length) {
    //         if (target == prev) {
    //             return 1;
    //         }
    //         return 0;
    //     }
    //     int cur1 = prev + numbers[index];
    //     int cur2 = prev - numbers[index];
    //     int ans = 0;
    //     ans += dfs(cur1, index + 1, numbers, target);
    //     ans += dfs(cur2, index + 1, numbers, target);
    //     return ans;
    // }
    //
    // public int solution(int[] numbers, int target) {
    //     int current = numbers[0];
    //     int answer = 0;
    //     answer += dfs(current, 1, numbers, target);
    //     answer += dfs(-current, 1, numbers, target);
    //     return answer;
    // }

    // =================================

    // depth first search
    static int ANSWER = 0;

    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target);
        return ANSWER;
    }

    private void dfs(int k, int[] numbers, int target) {
        if (k == numbers.length) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if (sum == target) {
                ANSWER++;
            }
            return;
        }
        if (k != numbers.length) {
            numbers[k] *= 1;
            dfs(k + 1, numbers, target);

            numbers[k] *= -1;
            dfs(k + 1, numbers, target);
        }
    }

    // =====================================

    // public int solution(int[] numbers, int target) {
    //     int answer = 0;
    //     answer = dfs(numbers, 0, 0, target);
    //     return answer;
    // }
    // int dfs(int[] numbers, int n, int sum, int target) {
    //     if(n == numbers.length) {
    //         if(sum == target) {
    //             return 1;
    //         }
    //         return 0;
    //     }
    //     return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    // }

    // =====================================

    // public int dfs(int prev, int index, int[] numbers, int target) {
    //     if (index >= numbers.length) {
    //         if (target == prev) {
    //             return 1;
    //         }
    //         return 0;
    //     }
    //     int cur1 = prev + numbers[index];
    //     int cur2 = prev - numbers[index];
    //     int ans = 0;
    //     ans += dfs(cur1, index + 1, numbers, target);
    //     ans += dfs(cur2, index + 1, numbers, target);
    //     return ans;
    // }
    //
    // public int solution(int[] numbers, int target) {
    //     int current = numbers[0];
    //     int answer = 0;
    //     answer += dfs(current, 1, numbers, target);
    //     answer += dfs(-current, 1, numbers, target);
    //     return answer;
    // }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        TargetNumber targetNumber = new TargetNumber();
        System.out.println(targetNumber.solution(numbers, target));
    }
}
