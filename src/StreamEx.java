import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        // Stream<String> generatedStream = Stream.<String>builder().add("hello").add("world").build();
        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);
        System.out.println(generatedStream);
        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.rangeClosed(1, 5);
        Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
        DoubleStream doubles = new Random().doubles(3);
        // doubles.forEach(System.out::println);
        Random random = new Random();
        System.out.println(random.doubles().limit(2).count());
        List<String> names = Arrays.asList("Hello", "World", "Test", "array");
        List<String> filteredNames = names.stream().filter(item -> item.contains("e")).collect(Collectors.toList());
        // for (int i = 0; i < filteredNames.size(); i++) {
        //     System.out.println(filteredNames.get(i));
        // }
        // Arrays.asList(19, 86, 35, 78, 12, 45, 89, 98, 100).stream().filter(it -> it >= 80).forEach(System.out::println);
        // Arrays.asList(3, 8, 9, 10, 20, 11, 22)
        //     .stream()
        //     .filter(item -> item > 10)
        //     .map(item -> item * item)
        //     .forEach(System.out::println);
        // Arrays.asList("Hello", "World", "Test", "array").stream().map(String::toUpperCase).forEach(System.out::println);
        // names.stream().map(String::toLowerCase).forEach(System.out::println);
        String[][] arr = {
            {"minus one", "zero", "one"},
            {"two", "Three"},
            {"Four", "Five", "Six"},
            {"eight", "ten"}
        };
        // Stream.of(arr).flatMap(Stream::of).forEach(System.out::println);
        // names.stream().sorted().forEach(System.out::println); //오름차순
        // names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //내림차순
        // Comparable VS Comparator
        // List<String> list = Arrays.asList("312", "123", "123", "123", "1234");
        // list.stream().distinct().forEach(System.out::println);
        // list.stream().peek(System.out::println).map(item -> "#" + item).forEach(System.out::println);
        // names.stream().limit(2).forEach(System.out::println);
        // names.stream().skip(2).forEach(System.out::println);
        // Stream<String> streamTwo = Arrays.asList("The", "Hell").stream();
        // Stream.concat(names.stream(), streamTwo).forEach(System.out::println);

        // long count = IntStream.of(1, 2, 3, 4, 5).count();
        // System.out.println("Count is " + count);
        //
        // long sum = IntStream.of(1, 2, 3, 4, 5).sum();
        // System.out.println("Sum is " + sum);
        //
        // OptionalInt min = IntStream.of(1, 2, 3, 4, 5).min();
        // System.out.println("Sum is " + min.getAsInt());
        //
        // OptionalInt max = IntStream.of(1, 2, 3, 4, 5).max();
        // System.out.println("Sum is " + max.getAsInt());
        //
        // OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();
        // System.out.println("Sum is " + average.getAsDouble());

        IntStream.of(1, 2, 3, 4, 5).average().ifPresent(System.out::println);

        Stream<String> stream = Stream.of("12", "23", "31");
        // boolean check = stream.anyMatch(item -> Character.toString(item.charAt(1)).contains("1"));
        // boolean check = stream.allMatch(item -> Character.isUpperCase(item.charAt(0)));
        boolean check = stream.noneMatch(item -> item.contains("e"));
        System.out.println(check);
    }
}
