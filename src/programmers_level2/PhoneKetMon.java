package programmers_level2;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬
// 10시 19분 시작 10시 40분 완료. 약간의 풀이참조(set 자료구조 이용)
// Set 자료구조 이용하는 방법으로 풀었음.

// 1. N마리 중에서 N/2마리를 선택하는 조합 구하기(시간초과로 실패)
// 2. 구한 조합중에서 중복 제거한 종류 번호의 개수 구하기
// 3. 최댓값 구하기.
public class PhoneKetMon {
    private int max;

    public int solution(int[] nums) {
//        int[] arr = new int[nums.length / 2];
//        combination(arr, 0, nums.length, arr.length, 0, nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() > nums.length / 2) {
            return nums.length / 2;
        }
        return set.size();
    }

//    private void combination(int[] arr, int index, int n, int r, int target, int[] nums) {
//        if (r == 0) {
//            System.out.println(Arrays.toString(arr));
//            int count = (int) Arrays.stream(arr)
//                    .distinct()
//                    .count();
//            if (count > max) {
//                max = count;
//            }
//            return;
//        }
//        if (target == n) {
//            return;
//        }
//        arr[index] = nums[target];
//        combination(arr, index + 1, n, r - 1, target + 1, nums);
//        combination(arr, index, n, r, target + 1, nums);
//    }

    public static void main(String[] args) {
//        int[] nums = {3, 1, 2, 3};
//        int[] nums = {3, 3, 3, 2, 2, 4};
        int[] nums = {3, 3, 3, 2, 2, 2};
        PhoneKetMon phoneKetMon = new PhoneKetMon();
        System.out.println(phoneKetMon.solution(nums));
    }
}
