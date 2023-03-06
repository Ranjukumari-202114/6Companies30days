/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1317. Convert Integer to the Sum of Two No-Zero Integers




class Solution {
    public int[] getNoZeroIntegers(int n) {
     int A = n;
     int B = 0;
     while(hasZero(A) || hasZero(B))
     {
         A--;
         B++;
     }
     int[] res = {A,B};
     return res;  
    }

    public static boolean hasZero(int x)
    {
        if(x==0)
          return true;
        while(x != 0)
        {
            int digit = x % 10;
            if(digit == 0)
              return true;
            x /= 10;
        }
        return false;
    }
    
}



