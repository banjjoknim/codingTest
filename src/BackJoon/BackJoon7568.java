package BackJoon;

import java.util.Scanner;

// 덩치
// 10시 16분 시작. 10시 30분 완료.
public class BackJoon7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt());
        }
        for (Student student : students) {
            for (int i = 0; i < n; i++) {
                if (isTaller(student, students[i]) && isHeavier(student, students[i])) {
                    student.gradeDown();
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(students[i].grade + " ");
        }
    }

    private static boolean isTaller(Student s1, Student s2) {
        return s1.tall < s2.tall;
    }

    private static boolean isHeavier(Student s1, Student s2) {
        return s1.weight < s2.weight;
    }

    static class Student {
        private int weight;
        private int tall;
        private int grade = 1;

        public Student(int weight, int tall) {
            this.weight = weight;
            this.tall = tall;
        }

        private void gradeDown() {
            this.grade = this.grade + 1;
        }
    }
}

