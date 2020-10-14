package programmers_level2;

import java.util.Stack;

// 큰 수 만들기
// 풀이 보고 풀었음.
// 1. 인덱스 0부터 큰 숫자 선택,
// 2. 이전에 선택된 수보다 이번 수가 더 크면 이전 수 삭제 및 이번 수 추가
// 3. 제거횟수가 k가 될때까지 큰 숫자 선택 반복
public class MakeBigNumber {
    public String solution(String number, int k) {
        //빠른 연산을 위해 StringBuilder을 사용했다.
        StringBuilder stringBuilder = new StringBuilder(number);
        int deleteCount = 0;
        int size = 1;

        while (deleteCount != k) {
            //전의 숫자와 비교해야 하므로 size는 1부터 시작한다.
            //전의 숫자보다 더 크면 전의 숫자를 삭제하고 크기가 줄어들었으므로 size를 줄여준다.
            if (size >= 1 && stringBuilder.charAt(size) > stringBuilder.charAt(size - 1)) {
                stringBuilder.deleteCharAt(size - 1);
                size--;
                deleteCount++;
                continue;
            }
            //size가 맨 끝으로 가고, 그 전의 숫자와 작거나 같으면 지금의 숫자를 삭제해준다.
            if (size == stringBuilder.length() - 1 && stringBuilder.charAt(size) <= stringBuilder.charAt(size - 1)) {
                stringBuilder.deleteCharAt(size);
                deleteCount++;
                size++;
                continue;
            }
            //그 외의 경우에는 size를 추가해준다.
            size++;
        }

        return stringBuilder.toString();
    }

    public String solution2(String number, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        int max = 0;
        for (int i = 0; i < number.length() - k; i++) {
            max = 0;
            for (int j = index; j <= k + i; j++) {
                if (number.charAt(j) - '0' > max) {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            stringBuilder.append(max);
        }

        return stringBuilder.toString();
    }

    public String solution3(String number, int k) {
        Stack<Character> stack = new Stack<>();
        char[] answer = new char[number.length() - k];

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return new String(answer);
    }

    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        System.out.println(makeBigNumber.solution(number, k));
        System.out.println(makeBigNumber.solution3(number, k));
    }
}
