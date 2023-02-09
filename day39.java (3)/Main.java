/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//231. Power of Two




class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n==0)
      {
          return false;
      }
      while(n!=1)
      {
          if(n%2 != 0)
          {
              return false;
          }
          else
          {
              n=n/2;
          }
      }
      return true ;
        
    }
}