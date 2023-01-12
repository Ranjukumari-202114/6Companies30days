/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i = 0; i<=reach; i++)
        {
            reach = Math.max(reach,i+nums[i]);
            if(reach >= nums.length-1)
            {
                return true;
            }
        }
        return false;
        
    }
}