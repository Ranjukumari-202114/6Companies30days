/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int triangularSum(int[] nums) {
     for (int sz = nums.length; sz > 0; --sz)
      for (int i = 0; i + 1 < sz; ++i)
        nums[i] = (nums[i] + nums[i + 1]) % 10;
     return nums[0];   
        
    }
}