package BackJoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// ABC
// 브론즈 2
// 9시 58분 시작. 10시 5분 완료.
public class BackJoon3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        map.put('A', numbers[0]);
        map.put('B', numbers[1]);
        map.put('C', numbers[2]);

        String order = sc.next();
        for (int i = 0; i < order.length(); i++) {
            System.out.print(map.get(order.charAt(i)) + " ");
        }
    }
}
