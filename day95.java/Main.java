/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//2595. Number of Even and Odd Bits



class Solution {
    public int[] evenOddBit(int n) {

    int[] ans = new int[2];
    int i = 0; // 0 := even, 1 := odd

    while (n > 0) {
      ans[i] += n & 1;
      n >>= 1;
      i ^= 1;
    }

    return ans;
    }

}