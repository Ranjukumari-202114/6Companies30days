/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxRotateFunction(int[] nums) {
     int sum = 0, F = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        int max = F;
        for (int i = n - 1; i > 0; i--) {
            F = F + sum - n * nums[i];
            max = Math.max(max, F);
        }
        return max;
   
        
    }
}