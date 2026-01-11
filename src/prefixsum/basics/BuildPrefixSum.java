package prefixsum.basics;

/*
Problem: Given an array, create its prefix sum array.
Example:
Input:  nums = [2, 4, 6, 8, 10]
Output: prefix = [2, 6, 12, 20, 30]

- prefix[i] stores the sum of all elements from index 0 to i
- Each position adds current element to previous sum
 */
public class BuildPrefixSum {
    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        return prefix;
    }

    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] prefix = buildPrefixSum(arr);
        print(prefix);
    }
}