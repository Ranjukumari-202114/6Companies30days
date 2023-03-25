/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//905. Sort Array By Parity



class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int count = 0;
     int n= nums.length;
     for(int i=0; i<n ; i++)
     {
         if(nums[i]%2 ==0)
         {
             int temp = nums[count];
             nums[count] = nums[i];
             nums[i] = temp;
             count++;
         }
     } 
     return nums; 
    }
}