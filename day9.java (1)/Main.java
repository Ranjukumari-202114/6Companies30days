/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int subarraySum(int[] nums, int k) {

    int ans = 0;
    for(int i=0;i<nums.length;i++)
    {
        int sum = 0;
        for(int j=i;j<nums.length;j++)
        {
             sum = sum+nums[j];
            if(sum==k)
            {
                ans++;
            }
        }
    }
    return ans;    
  }
}