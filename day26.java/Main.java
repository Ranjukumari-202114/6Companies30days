/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int singleNumber(int[] nums) {
     int res = 0;
        for (int num : nums){
            res ^= num;
        }
        return res; 
    }
}