/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxProfit(int[] prices) {
     int n =  prices.length;
     int profit = 0;

     for(int i=1;i<n;i++)
     {
        if(prices[i] > prices[i-1])
        {
            profit = profit + (prices[i] - prices[i-1]);
        }
     }
     return profit;  
    }
}