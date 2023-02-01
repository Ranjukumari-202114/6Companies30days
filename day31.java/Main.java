/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int pivot = 1;
        int sum = 0;
        for (int i = 0; i < 32; i ++){
            int p = pivot << i;
            if ((n & p) == p)
                sum ++;
        }
        return sum; 
        
    }
}