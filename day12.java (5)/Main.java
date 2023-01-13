/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    int [][] dir = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public void gameOfLife(int[][] board) {
     if(board==null || board.length==0|| board[0].length==0)
        return;
 
    int m=board.length;
    int n=board[0].length; 
    int[][] res  = new int[m][n];

    for(int i =0; i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            int count = 0;
            for(int[] d:dir)
            {
            int p = i+d[0];
            int q = j+d[1];

            if(p>=0 && p<m && q>=0 && q<n && board[p][q]==1)
            {
                count++;
            }
            }
            if(board[i][j] == 1)
            {
                if(count == 2 || count == 3)
                {
                    res[i][j] = 1;
                }
            }
            else{
                if(count==3)
                {
                    res[i][j]=1;
                }
            }

        }
    } 
     for(int i =0; i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            board[i][j] = res[i][j];
        }
     }
    }
}