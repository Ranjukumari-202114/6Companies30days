/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1572. Matrix Diagonal Sum




class Solution {
    public int diagonalSum(int[][] mat) {

     int n = mat.length;
     int sum = 0;

     for(int i=0; i <n; i++) 
      {
         sum = sum+mat[i][i];
         sum = sum+mat[i][n-i-1];
      } 

      if(n%2 != 0)
      {
          sum = sum-mat[n/2][n/2];
      }
      return sum; 
    }
}