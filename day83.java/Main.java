/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//867. Transpose Matrix



class Solution {
    public int[][] transpose(int[][] matrix) {
     int n = matrix.length;
     int m = matrix[0].length;
     int [][] ans = new int[m][n]; 
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             ans[j][i] = matrix[i][j];
         }
     } 
     return ans; 
    }
}
