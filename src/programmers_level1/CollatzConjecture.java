package programmers_level1;

// 21시 34분 시작 21시 50분 시작
public class CollatzConjecture {
    public int solution(int num) {
        int count = 0;
        long a = num;
        while (count < 500 && a != 1) {
            count += 1;

            if (a % 2 == 0) {
                a = a / 2;
                continue;
            }

            a = a * 3 + 1;
        }

        return count >= 500 ? -1 : count;
    }

    public static void main(String[] args) {
        int num = 626331;
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        System.out.println(collatzConjecture.solution(num));
    }
}
