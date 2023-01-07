/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxProfit(int[] prices) {
     int min = Integer.MAX_VALUE;
     int maxProfit = 0;
     for (int price : prices) {
       if (price < min) {
         min = price;
     }
    maxProfit = Math.max(maxProfit, price - min);
   }
   return maxProfit;
  }
}