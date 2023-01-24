/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean checkPerfectNumber(int num) {
    /*if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num; 
        */

        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i*i <= num; ++i) {
            if (num % i == 0) {
                sum += i;
                if (i*i != num) sum += num/i;
            }
        }
        return sum-num == num; 
    }
}
