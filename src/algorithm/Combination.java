package algorithm;

// 조합, 3개중 2개를 순서 상관없이 뽑기. nCr
public class Combination {
    public static void main(String[] args) {
        int n = 3;
        int r = 2;
        int[] resultArr = new int[r];
        combination(resultArr, 0, n, r, 0);

    }

    public static void combination(int[] arr, int index, int n, int r, int target) {
        if (r == 0) {
            print(arr, index);
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, index + 1, n, r - 1, target + 1);
            combination(arr, index, n, r, target + 1);
        }

    }

    public static void print(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
