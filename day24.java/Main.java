/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int xorOperation(int n, int start) {
     int r = start;
        for (; n > 1; n--) {
            start += 2;
            r = r ^ start;
        }
        return r;        
    }
}