/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//392. Is Subsequence



class Solution {
    public boolean isSubsequence(String s, String t) {
     int m = s.length();
     int n = t.length();
     int i=0;
     int j=0;
     while(i<m && j<n)
     {
         if(s.charAt(i)==t.charAt(j))
         {
             i++;
         }
         j++;
     } 
     if(i==s.length())
     {
         return true;
     } 
     return false; 
    }
}