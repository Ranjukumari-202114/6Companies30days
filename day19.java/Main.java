/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxSubArray(int[] nums) {
     /*int len = nums.length;
      int maxSum = Integer.MIN_VALUE;
      int sum = 0;
      for (int i = 0; i < len; i++) {
        sum = 0;
        for (int j = i; j < len; j++) {
          sum += nums[j];
          maxSum = Math.max(maxSum, sum);
        }
      }
      return maxSum;
      */

      int maxSum = nums[0];
      int sum = 0;
      int minSum = 0;
      for (int num : nums) {
        // prefix Sum
        sum += num;
        // update maxSum
        maxSum = Math.max(maxSum, sum - minSum);
        // update minSum
        minSum = Math.min(minSum, sum);
      }
      return maxSum;
    }
}