/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



class Solution {
    public void rotate(int[][] matrix) {
    /* int n = matrix.length;

     // transpose of the matrix
     for(int i=0;i< n; i++)
     {
        for(int j =i; j<n; j++)
        {
            int temp= matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }

     // reverse the row

     for(int i=0;i < n; i++)
     {
        for(int j =0; j<n/2; j++)
        {
            int temp= matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;
        }
     }
     */

     if(matrix == null || matrix.length == 1) return;
        int n = matrix.length;
        for(int i=0; i<= n/2; i++){
            for(int j = i; j< n-1-i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }
    
    }
}