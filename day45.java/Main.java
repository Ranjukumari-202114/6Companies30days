/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



2544. Alternating Digit Sum



class Solution {
    public int alternateDigitSum(int n) {
    int ans = 0;
    int sign = 1;

    for (; n > 0; n /= 10) {
      sign *= -1;
      ans += sign * n % 10;
    }

    return sign * ans;   
    }
}