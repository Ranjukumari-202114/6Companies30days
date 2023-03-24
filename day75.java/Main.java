/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//1332. Remove Palindromic Subsequences





class Solution {
    public int removePalindromeSub(String s) {
    /*if (s.length() == 0) {
            return 0;
        }
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return 1;
        }
        return 2; 
    */
         
        if(s.length() == 0)
        {
            return 0;
        }

        int n= s.length();
        boolean isPalin = true;
        for(int i=0; i<n/2; i++)
        {
            if(s.charAt(i) != s.charAt(n-i-1))
            {
                isPalin =false;
            }
        } 
        if(isPalin == true)
           return 1;
        return 2; 
    }
}
