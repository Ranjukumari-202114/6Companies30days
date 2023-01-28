/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int commonFactors(int a, int b) {
     int ans = 1;
    final int gcd = gcd(a, b);
    for (int i = 2; i <= gcd; ++i)
      if (a % i == 0 && b % i == 0)
        ++ans;
    return ans;
    }

    private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);   
    }
}