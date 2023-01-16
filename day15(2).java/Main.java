/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findKthPositive(int[] arr, int k) {
     int n =0; //n is count of missing number till now

     int c=1;
     int i = 0;
     int ans = 0;
     while(n<k)
     {
         if(c==arr[i])
         {
             c++;
             i++;

             if(i == arr.length)
             {
                 ans = c-1+k-n;
                 break;
             }
         }
         else
         {
             n++;
             if(n==k)
             {
                 ans = c;
                 break;
             }
             else{
                 c++;
             }
         }
     } 
     return ans;  
    }
}


// we can apply concept of binary search also and other map also