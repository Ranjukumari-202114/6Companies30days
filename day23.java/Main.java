/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int missingNumber(int[] nums) {
     Arrays.sort(nums);
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        return i;   
    }
}