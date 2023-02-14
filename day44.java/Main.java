/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


258. Add Digits



class Solution {
    public int addDigits(int num) {
      if(num == 0) return 0;
      if(num%9 == 0) return  9;
      else
        return num%9;
        
    }
}