/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2562. Find the Array Concatenation Value




class Solution {
    public long findTheArrayConcVal(int[] nums) {
     int i = 0;
     int j = nums.length-1;
     long ans= 0;
     String str = "";
     while(i<j)
     {
       str = String.valueOf(nums[i]) + String.valueOf(nums[j]);
       i++;
       j--;
       ans = ans+Long.valueOf(str);  
     }
     if(nums.length%2 != 0)
       ans= ans+nums[i]; 
     return ans;  
    }
}
