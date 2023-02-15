/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


2169. Count Operations to Obtain Zero



class Solution {
    public int countOperations(int num1, int num2) {
     if(num1==0 || num2 ==0) return 0;
     int count = 0;
     while(num1 != 0 && num2 != 0)
     {
         if(num1>=num2)
         {
          num1= num1-num2;
         } 
         else
         {
          num2=num2-num1;
         }
         count++;  
       }
       return count;
       
    }
}