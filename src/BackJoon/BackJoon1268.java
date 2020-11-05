package BackJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 임시 반장 정하기
// 브론즈 1
// 50분 소요.
public class BackJoon1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCount = sc.nextInt();
        List<Student> studentList = new ArrayList<>();
        int[][] classNumber = new int[studentCount][5];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 5; j++) {
                classNumber[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            boolean[][] check = new boolean[studentCount][5];
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < studentCount; k++) {
                    if (i == k) {
                        continue;
                    }
                    if (classNumber[i][j] == classNumber[k][j]) {
                        check[k][j] = true;
                    }
                }
            }
            int sameClassStudentCount = 0;
            for (int j = 0; j < check.length; j++) {
                for (int k = 0; k < 5; k++) {
                    if (check[j][k]) {
                        sameClassStudentCount++;
                        break;
                    }
                }
            }
            studentList.add(new Student(i + 1, sameClassStudentCount));
        }

        int max = studentList.stream()
            .mapToInt(student -> student.sameClassCount)
            .max()
            .getAsInt();

        int answer = studentList.stream()
            .filter(student -> student.sameClassCount == max)
            .mapToInt(student -> student.number)
            .min()
            .getAsInt();

        System.out.println(answer);
        // studentList.sort(Student::getSameClassCount);
        // System.out.println(studentList.get(0).number);
    }

    static class Student {
        private int number;
        private int sameClassCount;

        public Student(int number, int sameClassCount) {
            this.number = number;
            this.sameClassCount = sameClassCount;
        }

        public static int getSameClassCount(Student o1, Student o2) {
            if (o1.sameClassCount == o2.sameClassCount) {
                return o1.number - o2.number;
            }
            return o2.sameClassCount - o1.sameClassCount;
        }
    }

}

