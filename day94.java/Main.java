/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1550. Three Consecutive Odds



class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int n=arr.length;
        for(int i = 2; i < n; i++) 
        {
            if(arr[i] % 2 == 1 && arr[i-1] % 2 == 1 && arr[i-2] % 2 == 1 )
            return true;
        }
        return false; 
    }
}
