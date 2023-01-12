/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean search(int[] nums, int target) {
     int start = 0,  end = nums.length-1;
     while(start<=end)
     {
        if(nums[start] == target || nums[end] == target)
        {
            return true;
        }
        else if(target>nums[start])
        {
            while(start<end && nums[start+1] == nums[start]){
                start++;
            }
            start++;
        }    
        else if(target<nums[end])
        {
            while(start<end && nums[end-1] == nums[end]){
                end--;
            }
            end--;
        }
        else
        {
            break;
        }

     }
       
    return false;    
  }
}
