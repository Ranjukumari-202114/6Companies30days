/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//96. Unique Binary Search Trees





class Solution {
    public int numTrees(int n) {
     int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int sum = 0;
            for(int j = 0; j < i; j++)
                sum += dp[j] * dp[i - 1 - j];
            dp[i] = sum;
        }
        return dp[n];   
    }
}