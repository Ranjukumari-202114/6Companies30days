/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


387. First Unique Character in a String



class Solution {
    public int firstUniqChar(String s) {
      if(s.length() == 0 || s == null) return -1; 

      int[] charCount = new int[26];

       // Store frequency of all character
      for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;            
        } 

     // now traverse and find the first non repeating character
        for (int i = 0; i < s.length(); i++) {
            if(charCount[s.charAt(i) - 'a'] == 1) 
               return i;           
        } 
        return -1;
    }
}