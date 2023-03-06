/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//910. Smallest Range II




class Solution {
    public int smallestRangeII(int[] nums, int k) {
      int n = nums.length;
      Arrays.sort(nums);
      int res  = nums[n-1]-nums[0];

      for(int i = 0;i<n-1;i++)
      {
         int j=i+1;
         int low= Math.min(nums[0]+k,nums[j]-k);
         int high = Math.max(nums[n-1]-k ,nums[i]+k);
         res =Math.min(res, high-low);
      } 
      return res; 
    }
}
