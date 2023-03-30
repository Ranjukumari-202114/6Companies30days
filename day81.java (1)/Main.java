/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//219. Contains Duplicate II





class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     /*int n = nums.length;
     for(int i =0; i<n;i++)
     {
         for(int j=i+1; j<n; j++)
         {
            if(nums[i] == nums[j] && Math.abs(i-j)<=k)
            {
                 return true;
            }
         }
         
     } 
     return false; 
     */

      for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length && j<=i+k;j++)
            {
                if(nums[j]==nums[i])
                    return true;
            }
        return false;
     
    }
}