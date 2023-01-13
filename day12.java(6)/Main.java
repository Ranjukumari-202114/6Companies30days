/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findMin(int[] nums) {
      int left = 0;
      int right = nums.length-1;
      while(left<right) 
      {
          int mid = (left+right)/2;
          if(nums[mid]> nums[right])
          {
              left = mid+1;
              
          }
          else
          {
              right = mid;
          }

      } 
      return nums[left];
    }
}