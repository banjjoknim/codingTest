package BackJoon;

import java.util.Scanner;

// 참외밭
// 실버 5
// 삽질 1시간
// 접근방법 참조후 9분 소요.
// 모든 변을 각각 곱해서 더한 값은 (온전한 사각형의 넓이 * 3) + (포함되지 않는 사각형의 넓이 * 2)와 같다.
public class BackJoon2477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int maxWidth = 0;
        int maxHeight = 0;
        int[] lengths = new int[7];
        for (int i = 0; i < 6; i++) {
            int direction = sc.nextInt();
            int length = sc.nextInt();
            lengths[i] = length;
            if ((direction == 1 || direction == 2) && length > maxWidth) {
                maxWidth = length;
            }
            if ((direction == 3 || direction == 4) && length > maxHeight) {
                maxHeight = length;
            }
        }
        lengths[6] = lengths[0];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += lengths[i] * lengths[i + 1];
        }

        int notContainSpace = (maxWidth * maxHeight * 3) - sum;
        int totalSpace = (maxHeight * maxWidth) - notContainSpace;

        System.out.println(totalSpace * amount);
    }
}
