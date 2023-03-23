/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2108. Find First Palindromic String in the Array



class Solution {
    boolean isPalindrome(String s)
    {
      int  n= s.length();
      for(int i=0;i<n/2; i++)
      {
          if(s.charAt(i) != s.charAt(n-i-1))
          {
              return false;
          }
      }
      return true;
    }
    public String firstPalindrome(String[] words) {
      for(String word: words)
      {
          if(isPalindrome(word))
          {
              return word;
          }
      }
      return "";  
    }
}