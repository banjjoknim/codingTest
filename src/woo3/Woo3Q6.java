package woo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 정렬 안해서 틀렸음!!!!!
public class Woo3Q6 {
    public String[] solution(String[] logs) {

        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            if (!numbers.contains(logs[i].split(" ")[0])) {
                numbers.add(logs[i].split(" ")[0]);
            }
        }

        List<Student> studentList = new ArrayList<>();
        for (String studentNumber : numbers) {
            Map<Integer, Integer> map = new HashMap<>();
            for (String log : logs) {
                String[] arr = log.split(" ");
                if (arr[0].equals(studentNumber)) {
                    map.put(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                }
            }
            studentList.add(new Student(studentNumber, map));
        }
        List<String> answer = new ArrayList<>();
        for (Student student : studentList) {
            if (student.problemAndScore.size() < 5) {
                continue;
            }
            for (Student anotherStudent : studentList) {
                if (!student.equals(anotherStudent) && student.problemAndScore.equals(anotherStudent.problemAndScore)
                        && !answer.contains(
                        student.number)) {
                    answer.add(student.number);
                }
            }
        }

        if (answer.isEmpty()) {
            return new String[]{"None"};
        }

        return answer.stream()
                .sorted()
                .toArray(String[]::new);
    }

    static class Student {
        private String number;
        private Map<Integer, Integer> problemAndScore;

        public Student(String number, Map<Integer, Integer> problemAndScore) {
            this.number = number;
            this.problemAndScore = problemAndScore;
        }
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100",
                "1902 2 100", "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100",
                "1903 4 100", "1903 2 100", "1903 1 100", "2001 1 100", "2001 2 100", "2001 4 100", "2001 7 95",
                "2001 9 100", "2002 1 95", "2002 2 100", "2002 4 100", "2002 7 100", "2002 9 100"};
        Woo3Q6 woo3Q6 = new Woo3Q6();
        System.out.println(Arrays.toString(woo3Q6.solution(logs)));
        // Map<Integer, Integer> map1 = new HashMap<>();
        // map1.put(1, 1);
        // Map<Integer, Integer> map2 = new HashMap<>();
        // map2.put(1, 2);
        // System.out.println(map1.equals(map2));

    }
}
