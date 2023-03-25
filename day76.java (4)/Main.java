/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//922. Sort Array By Parity II


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
     /*int j = 1;
     int n = nums.length;
     for(int i = 0; i<n; i+=2)
     {
         if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1)
                    j += 2;
               swap(nums, i, j);
                }
        
     }  
     return nums; 
    }
    public  void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    */

    int n = nums.length;
    for(int i=0, j=1; i<n; i+=2,j+=2)
    {
        while(i<n && nums[i]%2 == 0) i +=2;
        while(j<n && nums[j]%2 != 0) j +=2;
        if (i < n) 
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    return nums;
    }
}