/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

1952. Three Divisors



class Solution {
    public boolean isThree(int n) {
      int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n)
            return false;
        int divisors = 1;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0)
                divisors += 2;
        }
        return divisors == 3;
      
    }
}