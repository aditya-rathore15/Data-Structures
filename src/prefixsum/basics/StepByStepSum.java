package prefixsum.basics;

/*
LeetCode 1413
Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.

Intuition:
Here, the problem asks to maintain a running sum that never drops below a certain value, the solution is
determined by the worst(minimum) prefix sum.

If we start from 0 and compute the running (prefix) sum of the array then the lowest point reached during this process
tells us how much we must shift the entire sequence upwards to stay valid.

Let:
prefixSum = running sum while iterating
minPrefix = minimum value of prefixSum

To ensure the sum is always >= 1:
startValue + minPrefix >= 1

startValue = 1 - minPrefix
 */
public class StepByStepSum {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefix = 0;

        for(int num : nums) {
            prefixSum += num;

            minPrefix = Math.min(prefixSum, minPrefix);
        }

        return 1 - minPrefix;
    }
}