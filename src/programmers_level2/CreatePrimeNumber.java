package programmers_level2;

import java.util.Arrays;

// 소수 만들기
// 18시 50분 시작. 19시 19분 완료.
// 방법 1. 3중 for문으로 모든 경우의 수를 찾아준다.
// 방법 2. 조합을 통해 3개의 수를 뽑은뒤 더해서 소수인지를 판별한다.
public class CreatePrimeNumber {
    private int result;

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        int[] arr = new int[3];
        combination(arr, 0, nums.length, 3, 0, nums);
        System.out.println(result);

        return answer;
    }

    private void combination(int[] arr, int index, int n, int r, int target, int[] nums) {
        if (r == 0) {
            System.out.println(Arrays.toString(arr));
            if (isPrime(Arrays.stream(arr).sum())) {
                result++;
            }
            return;
        }
        if (target == n) {
            return;
        }
        arr[index] = nums[target];
        combination(arr, index + 1, n, r - 1, target + 1, nums);
        combination(arr, index, n, r, target + 1, nums);
    }

    private boolean isPrime(int value) {
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        CreatePrimeNumber createPrimeNumber = new CreatePrimeNumber();
        System.out.println(createPrimeNumber.solution(nums));
    }
}
