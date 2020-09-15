package programmers_level1;

import java.util.Arrays;

// 키패드 누르기
// 11시 36분 시작 12시 21분 정지 12시 58분 시작. 13시 06분 13시 09분 중지. 실패
// 14시 40분 시작 15시 16분 완료. 풀이 보고 이해하였음.
public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int leftPosition = 10;
        int rightPosition = 12;
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftPosition = number;
            }
            if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightPosition = number;
            }
            if (number == 2 || number == 5 || number == 8 || number == 0) {
                int distanceFromLeft = getDistance(number, leftPosition);
                int distanceFromRight = getDistance(number, rightPosition);
                if (distanceFromLeft == distanceFromRight) {
                    if ("right".equals(hand)) {
                        answer += "R";
                        rightPosition = number;
                    }
                    if ("left".equals(hand)) {
                        answer += "L";
                        leftPosition = number;
                    }
                }
                if (distanceFromLeft < distanceFromRight) {
                    answer += "L";
                    leftPosition = number;
                }
                if (distanceFromLeft > distanceFromRight) {
                    answer += "R";
                    rightPosition = number;
                }
            }
        }
        return answer;
    }

    int getDistance(int number, int position) {
        if (number == 0) {
            number = 11;
        }
        if (position == 0) {
            position = 11;
        }
        int numberX = (number - 1) / 3;
        int numberY = (number - 1) % 3;
        int positionX = (position - 1) / 3;
        int positionY = (position - 1) % 3;
        return Math.abs(numberX - positionX) + Math.abs(numberY - positionY);
    }


    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        KeyPad keyPad = new KeyPad();
        System.out.println(keyPad.solution(numbers, hand));
    }
}
