/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3)
        {
            return nums.length;
        }
        int index = 2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i] != nums[index-2])
             {
                 nums[index] = nums[i];
                 index++;
             }
        }
        return index;
        
    }
}