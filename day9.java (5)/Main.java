/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
     private int maxProfit(int i,int buyOrSell, int[] prices, HashMap<String, Integer> hm)
     {
         if(i >= prices.length)
         {
             return 0;
         }
         String key = i+ " ranju" +buyOrSell;
         if(hm.containsKey(key))
            return hm.get(key);

         int profit = 0;
         if(buyOrSell==0)
         {
             int buy = maxProfit(i+1,1,prices,hm)-prices[i];
             int noBuy = maxProfit(i+1,0,prices,hm);
             profit = Math.max(buy,noBuy);
         }else
         {
         int sell = maxProfit(i+2,0,prices,hm)+prices[i];
         int noSell = maxProfit(i+1,1,prices,hm);
         profit = Math.max(sell,noSell);

         }
         hm.put(key,profit);
         return profit;

     }



    public int maxProfit(int[] prices) {
        HashMap<String, Integer> hm = new HashMap<>();
      return maxProfit(0,0,prices,hm);  
    }
}
Console


