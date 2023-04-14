/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1929. Concatenation of Array




class Solution {
    public int[] getConcatenation(int[] nums) {
     int n = nums.length;
     int [] ans = new int[n*2];
     for(int i=0; i<n; i++)
     {
         ans[i] = ans[i+n] = nums[i];
     } 
     return ans;  
    }
}
