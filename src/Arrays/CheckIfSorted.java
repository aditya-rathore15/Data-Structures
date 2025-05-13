package Arrays;

/*
1752 - check if array is sorted and rotated

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number
of positions (including zero). Otherwise, return false.
 */

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        int n = arr.length-1;
        boolean result = checkArray(arr, n);
        System.out.println(result);
    }

    public static boolean checkArray(int[] arr, int n) {
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(arr[i] < arr[i-1]) {
                count++;
            }
        }

        if(arr[n-1] > arr[0]) {
            count++;
        }

        return count <= 1;
    }
}