/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int removeDuplicates(int[] nums) {
     int j=1;
     for(int i=0;i<nums.length-1;i++)
     {
         if(nums[i] != nums[i+1])
            {
                nums[j] = nums[i+1];
                j++;
            }
     } 
     return j;  
    }
}