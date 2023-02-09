/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



1492. The kth Factor of n




class Solution {
    public int kthFactor(int n, int k) {
    int count = 0;
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            count++;
            if(k == count){
                return i;
            }
        }
    }
    return -1; 
    }
}