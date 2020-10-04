package programmers_level2;

import java.util.Arrays;

// 01시 00분 시작 02시 15분 완료.
// 최솟값 만들기
// 1. 순열 이용하여 순서 만들기 (필요없는거였음.. 삽질)
// 2. 차례대로 곱해서 더하기 (필요없는거였음.. 삽질)
// 3. 더해서 나온 값이 최소이면 반환 (필요없는거였음.. 삽질)
// 최솟값과 최댓값을 곱한것끼리 더한것이 가장 작은 수가 된다.
// 1 * 3 + 2 * 4 , 1 * 4 + 2 * 3 -> 3 + 8 = 11, 4 + 6 = 10
public class MakeLeast {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 4, 2};
        int[] B = new int[] {5, 4, 4};
        MakeLeast makeLeast = new MakeLeast();
        System.out.println(makeLeast.solution(A, B));
    }
}
