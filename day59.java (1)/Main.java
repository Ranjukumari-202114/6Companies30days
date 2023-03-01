/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1342. Number of Steps to Reduce a Number to Zero


class Solution {
    public int numberOfSteps(int num) {
      int count = 0;
      for( ; num>0; count++ )
      {
          if(num%2 == 0) 
          {
              num = num/2;
          }
          else
          {
              num = num-1;
          }
      } 
      return count;   
    }
}