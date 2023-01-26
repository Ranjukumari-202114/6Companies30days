/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int countDigits(int num) {
      int copynum = num;
      int count =0;
      while(copynum != 0)
      {
          int digit=copynum%10;
          if(num%digit == 0)
          {
              count++;
          }
          copynum = copynum/10;
      } 
      return count; 
    }
}