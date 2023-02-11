/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

724. Find Pivot Index



class Solution {
    public int pivotIndex(int[] nums) {
      //total sum of the array element
      int n = nums.length;
      int sum = 0;
      for(int i=0;i<n;i++)
      {
          sum  = sum+nums[i];
      } 
      int left_sum = 0;
      int right_sum = sum;
      for(int i=0;i<n;i++)
      {
          right_sum = right_sum-nums[i];
          if(left_sum == right_sum)
          {
              return i;
          }
          left_sum = left_sum+nums[i];
      }
      return -1;

    }
}