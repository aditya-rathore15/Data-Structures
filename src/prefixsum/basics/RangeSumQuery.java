package prefixsum.basics;

/*
Given an array and queries `(left, right)`, find sum of elements in that range.

Example:
Array: [3, 1, 4, 2, 5]
Query: (1, 3) → Answer: 1 + 4 + 2 = 7
Query: (0, 4) → Answer: 3 + 1 + 4 + 2 + 5 = 15
Query: (2, 2) → Answer: 4
 */
public class RangeSumQuery {
    private int[] prefixSum;

    public RangeSumQuery(int[] arr) {
        int n = arr.length;
        prefixSum = new int[n];

        prefixSum[0] = arr[0];

        for(int i=1; i<n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
    }

    public int rangeSum(int left, int right) {
        if(left == 0) {
            return prefixSum[right];
        }

        return prefixSum[right] - prefixSum[left-1];
    }
}