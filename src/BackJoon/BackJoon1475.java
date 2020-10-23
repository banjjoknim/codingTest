package BackJoon;

import java.util.*;

// 방 번호
// 09시 47분 시작. 10시 16분 완료.
public class BackJoon1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.nextLine();
        int[] numbers = new int[10];
        for (String number : roomNumber.split("")) {
            numbers[Integer.valueOf(number)]++;
        }
        numbers[6] = (int) Math.ceil((numbers[6] + numbers[9]) / 2.0);
        numbers[9] = 0;
        int count = Arrays.stream(numbers)
                .max()
                .getAsInt();
        System.out.println(count);
    }

}
