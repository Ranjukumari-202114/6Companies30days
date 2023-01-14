/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int search(int[] nums, int target) {
       int begin=0;
       int mid = 0;
       int end = nums.length-1;
       int index = -1;
       while (begin <= end)
       {
            mid = begin + (end-begin)/2;
            if (target == nums[mid])
            {
                return mid;
                
            } else if (target > nums[mid])
            {
                begin = mid + 1;
            }
            else if (target < nums[mid])
            {
                end = mid - 1;
            }
       }
        return index;
        
    }
}