/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2057. Smallest Index With Equal Value



class Solution {
    public int smallestEqual(int[] nums) {

     for(int i=0; i<nums.length; i++)
     {
         if(i%10 == nums[i])
             return i;
     } 
     return -1;  
    }
}
