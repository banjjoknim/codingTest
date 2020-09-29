package programmers_level2;

import java.util.HashSet;
import java.util.Set;

// 소수 찾기
// 답 없음. 3시간 넘게 걸림. 완전탐색 알고리즘에 대해 공부할 것.
public class SearchPrimeNumber {
    //    private TreeSet<String> set = new TreeSet<>();
//    private int count;
//
//    public static void main(String[] args) {
//
//        String numbers = "17";
//        SearchPrimeNumber s = new SearchPrimeNumber();
//        System.out.println(s.solution(numbers));
//
//    }
//
//    public int solution(String numbers) {
//
//        int size = numbers.length();
//
//        // 리스트에 담아줌
//        List<Character> arr = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            arr.add(numbers.charAt(i));
//        }
//
//        // 결과를 저장할 리스트
//        List<Character> result = new ArrayList<>();
//
//        // nPr에서 r을 계속 늘리면서 순열 알고리즘 수행
//        for (int i = 0; i < size; i++) {
//            permutation(arr, result, size, i + 1);
//        }
//
//        return count;
//    }
//
//    /**
//     * 소수 판별
//     *
//     * @param n : 판별할 숫자
//     * @return
//     */
//    private boolean isPrime(int n) {
//
//        int i;
//        int sqrt = (int) Math.sqrt(n);
//
//        // 2는 유일한 짝수 소수
//        if (n == 2)
//            return true;
//
//        // 짝수와 1은 소수가 아님
//        if (n % 2 == 0 || n == 1)
//            return false;
//
//        // 제곱근까지만 홀수로 나눠보면 됨
//        for (i = 3; i <= sqrt; i += 2) {
//            if (n % i == 0)
//                return false;
//        }
//
//        return true;
//    }
//
//    /**
//     * 순열 알고리즘
//     *
//     * @param arr    : 원본 리스트
//     * @param result : 결과 담을 리스트
//     * @param n      : 전체 갯수
//     * @param r      : 선택할 갯수
//     */
//    public void permutation(List<Character> arr, List<Character> result, int n, int r) {
//
//        if (r == 0) {
//
//            // 0으로 시작하는 부분집합은 제외
//            if (result.get(0) != '0') {
//
//                String str = "";
//                int size = result.size();
//                for (int i = 0; i < size; i++) {
//                    str += result.get(i);
//                }
//
//                int num = 0;
//
//                // 이미 나온 숫자 조합이 아닐 경우
//                if (!set.contains(str)) {
//                    num = Integer.parseInt(str);
//                    set.add(str);
//
//                    // 소수 판별
//                    if (isPrime(num)) {
//                        System.out.println(num);
//                        count++;
//                    }
//                }
//            }
//
//            return;
//        }
//
//        for (int i = 0; i < n; i++) {
//
//            result.add(arr.remove(i));
//            permutation(arr, result, n - 1, r - 1);
//            arr.add(i, result.remove(result.size() - 1));
//        }
//
//    }

//    public int solution(String numbers) {
//        int answer = 0;
//        String[] strArr = numbers.split("");
//        int[] numArr = new int[strArr.length];
//        for (int i = 0; i < numArr.length; i++) {
//            numArr[i] = Integer.parseInt(strArr[i]);
//        }
//
//        Set<Integer> set = new HashSet<>();
//
//        //1부터 만들 수 있는 최대 길이까지 숫자 조합
//        for (int i = 1; i <= numArr.length; i++) {
//            perm(strArr, 0, i, set);
//        }
//        answer = set.size();
//
//        return answer;
//    }
//
//    public void perm(String[] arr, int depth, int k, Set set) {//숫자 조합
//
//        if (depth == k) {//원하는 k개의 숫자가 세팅됐으므로 더이상 순열생성X
//            print(arr, k, set);
//            return;
//        }
//        for (int i = depth; i < arr.length; i++) {
//            swap(arr, i, depth);
//            perm(arr, depth + 1, k, set);
//            swap(arr, i, depth);
//        }
//    }
//
//    public void swap(String[] arr, int i, int j) {
//        String temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public void print(String[] arr, int k, Set set) {//숫자 연결
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < k; i++) {
////            System.out.print(arr[i]);
//            s.append(arr[i]);//숫자연결하기
//        }
////        System.out.println();
//        primeNumber(set, s);
//    }
//
//    public void primeNumber(Set set, StringBuilder s) {//소수 체크
//        int num = Integer.parseInt(String.valueOf(s));
//        boolean prime = true;
//        if (num <= 1) {
//            return;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                prime = false;
//                break;
//            }
//        }
//        if (prime) {
//            set.add(num);
//        }
//    }

    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }

    public static void main(String[] args) {
        SearchPrimeNumber searchPrimeNumber = new SearchPrimeNumber();
        System.out.println(searchPrimeNumber.solution("17"));
    }
}
