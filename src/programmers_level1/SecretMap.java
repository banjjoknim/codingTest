package programmers_level1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 비밀지도
// 17시 35분 시작. 18시 15분 완료.
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String fillStr = "";
        for (int i = 0; i < n; i++) {
            fillStr += " ";
        }
        Arrays.fill(answer, fillStr);

        String[] arr1Row = new String[n];
        String[] arr2Row = new String[n];
        arr1Row = getArrRow(n, arr1, arr1Row);
        arr2Row = getArrRow(n, arr2, arr2Row);

        for (int i = 0; i < n; i++) {
            String[] answerArray = answer[i].split("");
            for (int j = 0; j < n; j++) {
                if (arr1Row[i].charAt(j) == '1') {
                    answerArray[j] = "#";
                }
            }
            for (int j = 0; j < n; j++) {
                if (arr2Row[i].charAt(j) == '1') {
                    answerArray[j] = "#";
                }
            }
            answer[i] = Arrays.stream(answerArray).collect(Collectors.joining());
        }
        return answer;
    }

    private String[] getArrRow(int n, int[] arr, String[] arrRow) {
        for (int i = 0; i < n; i++) {
            String temp = "";
            String s = Integer.toBinaryString(arr[i]);
            int length = s.length();
            while (length < n) {
                length += 1;
                temp += "0";
            }
            arrRow[i] = temp + s;
        }
        return arrRow;
    }

    public static void main(String[] args) {
        int n = 5;
        SecretMap secretMap = new SecretMap();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        secretMap.solution(n, arr1, arr2);
    }
}
