/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

     List<Integer> ans = new ArrayList<Integer>();
     if (matrix.length == 0)
            return ans;
     int m = matrix.length;
     int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //if one row/column left, no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    ans.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    ans.add(matrix[x++][y]);
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                ans.add(matrix[x][y++]);
            }
 
            //right - move down
            for(int i=0;i<m-1;i++){
                ans.add(matrix[x++][y]);
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                ans.add(matrix[x][y--]);
            }
 
            //left - move up
            for(int i=0;i<m-1;i++){
                ans.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return ans;
    
      
    }
}
