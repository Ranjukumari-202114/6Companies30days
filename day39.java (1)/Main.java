/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//453. Minimum Moves to Equal Array Elements




class Solution {
    public int minMoves(int[] nums) {
     int i=0;
     int min = nums[0];
     int result  = 0;


     // find minimum element into the array

     for ( i = 0; i<nums.length;i++)
     {
         if(nums[i]<min)
         {
             min = nums[i];
         }
     } 

     for( i = 0; i<nums.length;i++)
     {
         result = result+nums[i]-min;
     } 
     return result; 
    }
}