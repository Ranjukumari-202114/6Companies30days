/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


371. Sum of Two Integers




class Solution {
    public int getSum(int a, int b) {
    /* while (a != 0 && b != 0) {
            int and = a & b;
            int xor = a ^ b;
            a = and << 1;
            b = xor;
        }
        if (a!= 0) {
            return a;
        }
        else {
            return b;
        } 
        */

         while(b!=0){
        
            // Carry is obtained by ANDing the bits
            int c = a&b;
            // Final sum value is obtained by XORing the bits
            a=a^b;
            // b is the new carry value obtained by left shifting by 1
            // next iteration onwards b is the carry to be added
            b=c<<1;
        }
 
        return a;  
    }
}