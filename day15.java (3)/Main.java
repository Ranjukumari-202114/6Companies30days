/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int arrangeCoins(int n) {
    /*  int level = 0, coin = 1;
        while (n >= coin) {
            n -= coin;
            coin++;
            level++;
        }
        return level;  

    */


    int low = 1, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid * (mid + 1L) <= n * 2L) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
}