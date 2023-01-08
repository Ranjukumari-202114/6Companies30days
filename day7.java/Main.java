/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;  
    int count = 0;
    while (count <= end) {
      if (nums[count] == 0) {
        swap(nums, start++, count++);
      } else if (nums[count] == 1) {
        count++;
      } else {
        swap(nums, end--, count);
      }
    }    
  }
  private void swap(int[] nums, int index1, int index2) {
    int tmp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = tmp;
  }
 
}