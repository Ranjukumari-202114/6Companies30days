/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
     final int gcd = getGCD(numsDivide);

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; ++i)
      if (gcd % nums[i] == 0)
        return i;

    return -1;
  }

  private int getGCD(int[] nums) {
    int g = nums[0];
    for (final int num : nums)
      g = gcd(g, num);
    return g;
  }

  int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);   
    }
}