/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maximumProduct(int[] nums) {
     int n =  nums.length;
     Arrays.sort(nums);
     /*int a = nums[n-1]*nums[n-2]*nums[n-3];
     int b = nums[0]*nums[1]*nums[n-1];
     if(a>b)
     {
         return a;
     } 
     else
     {
         return b;
     } 
     */
     return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);

    }
}