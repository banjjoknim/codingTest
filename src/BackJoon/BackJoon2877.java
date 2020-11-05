package BackJoon;

import java.util.Scanner;

// 4와 7
// 실버 1
// 삽질 1시간
// 접근방법 참조 후 3분 컷....
public class BackJoon2877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        
        // 4와 7로만 이루어진 k번째 수는 k + 1 을 이진수로 변환한뒤 맨 첫 글자를 제외한 부분을 각각 4와 7로 변환시킨 것과 같다.
        String answer = Integer.toBinaryString(count + 1);
        System.out.println(answer.substring(1).replace("0", "4").replace("1", "7"));
    }
}
