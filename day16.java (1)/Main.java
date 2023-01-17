/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int specialArray(int[] nums) {
     
     for(int i =1;i<=1001;i++)
     {
         int count =0;
         for(int num : nums)
         {
             if(num >= i)
             {
                 count++;
             }
         }
         if(i==count)
           return i;
     } 
     return -1;

    }
}