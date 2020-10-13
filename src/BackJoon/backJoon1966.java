package BackJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 프린터 큐
// 01시 40분 시작. 02시 40분 완료.
// 1. 가장 앞에 있는 문서의 중요도 확인
// 2. 나머지중에 중요도 높은게 있으면 제거한 뒤, 제일 뒤에 배치
// 3. 타겟 문서의 위치 -1
// 4. 타겟 문서가 인쇄될 때까지 반복.
public class backJoon1966 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCase = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < testCase; i++) {
            print();
        }
    }

    private static void print() {
        String documentsCountAndPosition = scanner.nextLine();
        String documents = scanner.nextLine();
        int targetPosition = Integer.valueOf(documentsCountAndPosition.split(" ")[1]);
        int printCount = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < documents.split(" ").length; i++) {
            queue.offer(Integer.valueOf(documents.split(" ")[i]));
        }

        while (true) {
            boolean check = queue.stream()
                .anyMatch(importance -> importance > queue.peek());
            if (check) {
                queue.offer(queue.poll());
                if (targetPosition == 0) {
                    targetPosition = queue.size() - 1;
                    continue;
                }
                if (targetPosition > 0) {
                    targetPosition = targetPosition - 1;
                }
                continue;
            }
            queue.poll();
            printCount++;
            if (targetPosition == 0) {
                break;
            }
            if (targetPosition > 0) {
                targetPosition = targetPosition - 1;
            }
        }
        System.out.println(printCount);
    }
}

