/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public double nthPersonGetsNthSeat(int n) {
     if(n==1) return 1.0;
        double[] dp = new double[n];
        double sum = 0;
        for (int i = 1; i < n; i++) {
            dp[i] =  (1 + sum) / (i + 1);
            sum += dp[i];
        }
        return dp[n - 1];   
    }
}