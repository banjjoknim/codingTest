package programmers_level2;

// 행렬의 곱셈
// 풀이 보고 풀었음. 행렬의 곱셈식!!!!
// 새로운 배열의 행의 크기는 arr1의 행의 크기와 같다.
// 새로운 배열의 열의 크기는 arr2의 열의 크기와 같다.
// @1 - 그러므로 새로운 배열의 크기는 이와 같이 선언한다.
// @2 - 새로운 배열에 값을 넣기 위해 가장 외부의 반복문은 arr1의 행의 크기이다.
// @3 - 새로운 배열에 값을 넣기 위해 두 번째 외부의 반복문은 열의 크기이다.
// @4 - 새로운 배열에 두 행렬의 곱을 더한 값을 넣는다.
// 하나의 결과행을 구할 때 arr1 와 arr2의 행은 그대로지만 열이 바뀌면서 곱한 값을 더한다.
// 즉, 열의 개수만큼만 반복하면 된다
public class MultipleMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length]; // @1
        for (int i = 0; i < answer.length; i++) { // @2
            for (int j = 0; j < answer[0].length; j++) { // @3
                for (int k = 0; k < arr1[0].length; k++) { // @4
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

}
