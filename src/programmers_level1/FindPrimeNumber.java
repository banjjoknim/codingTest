package programmers_level1;

// 소수 찾기
// 13시 37분 시작 14시 47분 완료.
public class FindPrimeNumber {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            check = isPrime(i, check);
            if (check) {
                answer += 1;
            }
        }
        return answer;
    }

    private boolean isPrime(int i, boolean check) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0 && i != j) {
                check = false;
                break;
            }
        }
        return check;
    }


//        int answer = 0;
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                answer += 1;
//            }
//        }
//        return answer;


//    public static boolean isPrime(int num) {
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        System.out.println(num);
//        return true;
//    }


    public static void main(String[] args) {
        FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
        System.out.println(findPrimeNumber.solution(10));
//        System.out.println(isPrime(2));
    }
}
