/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


1480. Running Sum of 1d Array



class Solution {
    public int[] runningSum(int[] nums) {
     int n = nums.length;
     int[] ans  = new int[n];
     int sum=0;
     for(int i=0; i<n; i++)
     {
         sum = sum+nums[i];
         ans[i] = sum;
     } 
     return ans;  
    }
}