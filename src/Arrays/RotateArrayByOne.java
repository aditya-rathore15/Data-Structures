package Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length-1;
        rotate(arr, n);
        print(arr);
    }

    public static void rotate(int[] arr, int n) {
        int firstElement = arr[n];

        for(int i=n; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = firstElement;
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
