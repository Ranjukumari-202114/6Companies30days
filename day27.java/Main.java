/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int pivotInteger(int n) {
      final int y = (n * n + n) / 2;
    final int x = (int) Math.sqrt(y);
    return x * x == y ? x : -1;   
        
    }
}