/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean isUgly(int n) {
     if(n<=0) return false;
     if(n==1) return true;
    /* if(n % 2 == 0) 
        return isUgly(n / 2);
     else if(n % 3 == 0) 
        return isUgly(n / 3);
     else if(n % 5 == 0)
        return isUgly(n / 5);
     else 
        return false;
    
    */ 
    while(n>1)
    {
        if(n%2 ==0)
        {
            n=n/2;
        }
        else if(n%3 == 0)
        {
            n=n/3;
        }
        else if(n%5 == 0)
        {
            n=n/5;
        }
        else 
          return false;
    }
    return true;    
    }
}