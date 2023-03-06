/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1137. N-th Tribonacci Number



class Solution {
    public int tribonacci(int n) {

//Time limit exceeded

   /* if(n == 0)
    {
        return 0;
    } 
    else if(n==1 || n==2)
    {
        return 1;
    }
    return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    
  */

    if (n < 2) return n;
        int a = 0, b = 1, c = 1, d;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}