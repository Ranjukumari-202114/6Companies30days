/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


1837. Sum of Digits in Base K



class Solution {
    public int sumBase(int n, int k) {
     int result = 0;
     while(n>0)
     {
         result = result+(n%k);
         n= n/k;
     }  
     return result; 
    }
}