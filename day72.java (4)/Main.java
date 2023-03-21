/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//896. Monotonic Array



class Solution {
    public boolean isMonotonic(int[] nums) {
    int N = nums.length;
    boolean inc = true;
    boolean dec = true;
 
    // Loop to check if array is increasing
    for (int i = 0; i < N - 1; i++) {
 
      // To check if
      // array is not increasing
      if (nums[i] > nums[i + 1]) {
        inc = false;
      }
    }
 
    // Loop to check if array is decreasing
    for (int i = 0; i < N - 1; i++) {
 
      // To check if
      // array is not decreasing
      if (nums[i] < nums[i + 1]) {
        dec = false;
      }
    }
 
    // Pick one whether inc or dec
    return inc || dec;
       
    }
}