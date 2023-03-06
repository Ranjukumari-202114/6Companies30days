/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//976. Largest Perimeter Triangle



class Solution {
    public int largestPerimeter(int[] nums) {
     Arrays.sort(nums);
     for(int i=nums.length-1;i>1;i--)
     {
         if(nums[i]<nums[i-1]+nums[i-2])
         {
             return nums[i]+nums[i-1]+nums[i-2];
         }
     } 
     return 0;  
    }
}
