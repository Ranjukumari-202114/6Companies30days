/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
     int n = arr1.length;
     int m = arr2.length;
     int result = 0;
     for(int i=0;i<n;i++)
     {
         boolean flag = true;
         for(int j=0;j<m;j++)
         {
             if(Math.abs(arr1[i]-arr2[j]) <= d )
             {
                 flag = false;
                    break;
             }
         }
         if (flag) result ++;
     } 
     return result;  
    }
}