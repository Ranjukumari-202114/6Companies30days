/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int searchInsert(int[] nums, int target) {
      int start = 0;
      int end = nums.length-1;
      while(start<=end) 
      {
          int mid = (start+end)/2;
          if(nums[mid] == target)
          {
              return mid;
          }
          else if(nums[mid]<target)
          {
              start = mid+1;
          }
          else
          {
              end = mid-1;
          }
      }
      return end+1; 
    }
}