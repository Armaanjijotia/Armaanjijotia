class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start new from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update max sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}