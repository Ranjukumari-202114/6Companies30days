/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1281. Subtract the Product and Sum of Digits of an Integer




class Solution {
    public int subtractProductAndSum(int n) {

     int product = 1;
     int sum = 0;
     int rem = 0;

     while(n>0)
     {
          rem = n%10;
          n=n/10;
          product =product*rem;
          sum = sum+rem;
     } 
     return product-sum;  
    }
}