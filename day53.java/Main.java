/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//598. Range Addition II




class Solution {
    public int maxCount(int m, int n, int[][] ops) {
     int min_row = m;
     int min_col = n;

     for(int [] temp : ops)
     {
         min_row= Math.min(min_row, temp[0]);
         min_col=Math.min(min_col,temp[1]);
     }
     return min_row*min_col;

    }
}