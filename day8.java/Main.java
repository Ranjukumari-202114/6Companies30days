/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int countKDifference(int[] nums, int k) {
      int m  = nums.length;
      int ans = 0;
      for(int i=0;i<m;i++)
      {
          for(int j=i+1;j<m;j++)
          {
              if(Math.abs(nums[i] - nums[j]) == k)
              {
                  ans++;
              }
                 
          }
      } 
      return ans; 
        
    }
}