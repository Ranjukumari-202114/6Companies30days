/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean judgeSquareSum(int c) {
    
  /*  for(int a=0; a*a<=c;a++)
    {
        for(int b=0;b*b<=c;b++)
        {
            if(a*a+b*b==c)
              return true;
        }
    }
    return false;
    */

    /*for (long a = 0; a * a <= c; a++) {
            int b =  c - (int)(a * a);
            int i = 1, sum = 0;
            while (sum < b) {
                sum += i;
                i += 2;
            }
            if (sum == b)
                return true;
        }
        return false; 

        */

       /*
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
        */
         /*for (int i=0;i<=Math.sqrt(c);i++) 
          if (Math.floor(Math.sqrt(c-i*i)) == Math.sqrt(c-i*i)) return true;
          return false;

          */

        for (long a = 0; a * a <= c; a++) {
            int b = c - (int)(a * a);
            if (binary_search(0, b, b))
                return true;
        }
        return false;
    }
    public boolean binary_search(long s, long e, int n) {
        if (s > e)
            return false;
        long mid = s + (e - s) / 2;
        if (mid * mid == n)
            return true;
        if (mid * mid > n)
            return binary_search(s, mid - 1, n);
        return binary_search(mid + 1, e, n);
    }
}