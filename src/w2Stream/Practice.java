package w2Stream;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list2.add("a");
        list2.add("b");
        list1.stream().forEach(System.out::println);
        list1.removeAll(list2);
        System.out.println();
        list1.stream().forEach(System.out::println);
    }
}
