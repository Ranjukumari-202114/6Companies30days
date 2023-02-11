/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

209. Minimum Size Subarray Sum



class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (j < nums.length) {
            while (sum < target && j < nums.length) sum += nums[j++];
            if(sum>=target){
                while (sum >= target && i < j) sum -= nums[i++];
                min = Math.min(min, j - i + 1);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;


    }
}