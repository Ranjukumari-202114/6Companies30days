/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int numIdenticalPairs(int[] nums) {
       int res = 0;
       for(int i = 0; i<nums.length; i++)
       {
          for(int j = i+1; j<nums.length; j++)
          {
            if(nums[i] == nums[j])
             {
                 res++;
             }
          }
       }
       return res;      
    }
}