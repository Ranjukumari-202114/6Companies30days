/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] res = new int[] {-1,-1};
     int start=0, end = nums.length-1;
     if(nums.length == 0)
     {
         return res;
     }
     while(start<end)
     {
         int mid = start+(end-start)/2;
         if(nums[mid] >= target)
         {
             end = mid;
         }
         else
         {
             start = mid+1;
         }
     }   
     
      if(nums[start] != target)
         {
             return res;
         }

      res[0] = start;
      end = nums.length;
      while(start<end)
      {
         int mid = start+(end-start)/2;
          if(nums[mid] > target)
         {
             end = mid;
         }
         else
         {
             start = mid+1;
         }
         
      } 
      res[1] = start-1;
       return res;  
    }
}