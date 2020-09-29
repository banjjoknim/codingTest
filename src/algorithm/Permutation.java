package algorithm;

// 순열, 3개중 2개를 순서대로 뽑기. nPr
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 0, arr.length, 2);
    }

    public static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            permutation(arr, depth + 1, n, r);
            swap(arr, i, depth);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


