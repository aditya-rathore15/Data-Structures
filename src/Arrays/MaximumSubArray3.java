package Arrays;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

This solution is O(n)
 */
public class MaximumSubArray3 {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int globalSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currentSum = Math.max(currentSum+nums[i], nums[i]);
            globalSum = Math.max(globalSum, currentSum);
        }

        return globalSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}