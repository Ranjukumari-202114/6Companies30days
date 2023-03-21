/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2348. Number of Zero-Filled Subarrays



class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long count = 0;
    long ans = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
          count++;
          ans += count;
        }else count=0;
    }
   
    return ans;    
    }
}