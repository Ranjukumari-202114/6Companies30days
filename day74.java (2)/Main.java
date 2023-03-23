/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//125. Valid Palindrome


class Solution {
    public boolean isPalindrome(String s) {
     //s = s.replaceAll("\\s", "").trim();
     s = s.replaceAll("[^a-zA-Z0-9]","");
     s = s.toLowerCase();   
     int n= s.length();
     for(int i=0; i<n/2;i++)
     {
         if(s.charAt(i) != s.charAt(n-i-1))
            return false;
     } 
     return true;  
    }
}
