/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void moveZeroes(int[] nums) {
     int i = 0;
    int j = 0;
 
    while (j < nums.length) {
        if (nums[j] != 0) {
            nums[i++] = nums[j];
        }
 
        j++;
    }
 
    while (i < nums.length) {
        nums[i++] = 0;
    }   
 }
}