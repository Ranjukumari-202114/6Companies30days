/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//303. Range Sum Query - Immutable


class NumArray {

    public NumArray(int[] nums) {
      prefix = new int[nums.length + 1];
    for (int i = 0; i < nums.length; ++i)
      prefix[i + 1] = nums[i] + prefix[i];
    
    }
    
    public int sumRange(int left, int right) {
     return prefix[right + 1] - prefix[left];   
    }
    private int[] prefix;

}