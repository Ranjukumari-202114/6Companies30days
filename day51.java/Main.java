/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


540. Single Element in a Sorted Array




class Solution {
    public int singleNonDuplicate(int[] nums) {
     int l = 0;
    int r = nums.length - 1;

    while (l < r) {
      int m = (l + r) / 2;
      if (m % 2 == 1)
        --m;
      if (nums[m] == nums[m + 1])
        l = m + 2;
      else
        r = m;
    }

    return nums[l];   
    }
}