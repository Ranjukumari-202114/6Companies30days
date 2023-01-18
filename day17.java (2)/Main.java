/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean checkIfExist(int[] arr) {
      int n= arr.length;
      for(int i = 0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if((arr[i] == (2*arr[j]))  || (2*arr[i] == arr[j]))
                   return true;
          }
      }
      return false;  
    }
}