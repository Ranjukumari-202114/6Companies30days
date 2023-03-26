/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//942. DI String Match




class Solution {
    public int[] diStringMatch(String s) {
       int n =s.length() ; 
      int[] ans = new int[n+1];
      int min = 0;
      int max = n;
      for(int i=0; i<n; i++)
      {
         ans[i] = s.charAt(i) == 'I' ? min++ : max--;
         ans[n] = min;
      } 
      return ans; 
    }
}