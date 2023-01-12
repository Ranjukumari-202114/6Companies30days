/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int search(int[] nums, int target) {
     int start = 0,  end = nums.length-1;
     while(start<=end)
     {
         int mid = (start+end)/2;

         if(nums[mid] == target)
              return  mid;
              
         if(nums[start] <= nums[mid])
         {
             if(nums[start] <=target && target <=nums[mid])
              {
                  end = mid-1;
              }
              else
              {
                  start = mid+1;
              }
         }
         else
         {
             if(nums[mid] <= target && target<= nums[end])
             {
                 start = mid+1;
             }
             else
             {
                 end = mid-1;
             }
         }
    }
    return -1;      
    }
}