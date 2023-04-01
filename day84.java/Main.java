/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2496. Maximum Value of a String in an Array



class Solution {
    public int unequalTriplets(int[] nums) {
     int res = 0;
        for(int i = 0; i<nums.length - 2; i++){
            for(int j = i + 1; j<nums.length - 1; j++){
                if (nums[i] == nums[j]) continue;
                for(int k = j + 1; k<nums.length; k++){
                    if (nums[i] != nums[k] && nums[j] != nums[k]) res++;
                }
            }
        }
        return res;   
    }
}