/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//1688. Count of Matches in Tournament





class Solution {
    public int numberOfMatches(int n) {
     int total = 0;
     int match = 0;
     while(n!=1)
     {
         match =n/2;
         total = total+match;
         if(n%2==0)
         {
             n=match;
         }
         else
         {
             n=match+1;
         }

     }
     return total;
       
    }
}