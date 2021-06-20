package BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backJoon2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextInt());
        }
        list.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
