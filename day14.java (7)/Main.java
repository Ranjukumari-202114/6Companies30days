/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int countNegatives(int[][] grid) {
     int count = 0;
     int n = grid.length;
     int m=grid[0].length;
     for(int i=0; i<n;i++)
     {
         for(int j=0; j<m;j++)
         {
             if(grid[i][j]<0)
             {
                 count = count+1;
             }
         }
     }
     return count;   
    }
}
