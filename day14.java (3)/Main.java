/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean isPerfectSquare(int num) {
     if(num == 1)
     {
         return true;
     }
     /*for (int i = 1; i*i  <= num; i++) {
 
            // If (i * i = n)
            if ((num % i == 0) && (num / i == i)) {
                return true;
            }
        }
        return false;
       */

        long left = 1, right = num;
         
        while (left <= right)
        {
            long mid = (left + right) / 2;
           
            // Check if mid is perfect square
            if (mid * mid == num)
            {
                return true;
            }
            
            // Mid is small -> go right to increase mid
            if (mid * mid < num)
            {
                left = mid + 1;
            }
           
            // Mid is large -> to left to decrease mid
            else
            {
                right = mid - 1;
            }
        }
        return false;
     
    }
}