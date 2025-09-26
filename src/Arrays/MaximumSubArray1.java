package Arrays;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

This solution is O(n^3)
 */
public class MaximumSubArray1 {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++) {
                int sum = 0;
                for(int k=i; k<j; k++) {
                    sum += nums[k];
                }

                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}