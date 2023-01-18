/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      /*  if(matrix.length == 0) return false;
        int n=matrix.length;
         int m = matrix[0].length;
         int low = 0;
         int high = m-1;
      
      while(low<n && high>=0)  
      {
          if(target==matrix[low][high])
                return true;         
           else if(target<matrix[low][high])
                high--;
           else 
                low++;
      }
      return false;
     */


     if(matrix.length==0) 
            return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int low = 0;
        int high = (n*m)-1;
        
        while(low<=high)
        {
            int mid = (low +(high-low)/2);
            if(matrix[mid/m][mid%m]==target)
                return true;
            
            if(matrix[mid/m][mid%m]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false; 
    }
}
