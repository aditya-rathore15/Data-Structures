package prefixsum.basics;

/*
LeetCode 724
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of
all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This
also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        sumLeft[0] = 0;

        for(int i=1; i<n; i++) {
            sumLeft[i] = sumLeft[i-1] + nums[i-1];
        }

        sumRight[n-1] = 0;

        for(int i = n-2; i>=0; i--) {
            sumRight[i] = sumRight[i+1] + nums[i+1];
        }

        for(int i=0; i<n; i++) {
            if(sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int totalSum = 0;

        for(int num : nums) {
            totalSum+=num;
        }

        int leftSum = 0;

        for(int i=0; i<nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}