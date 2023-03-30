/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//383. Ransom Note




class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int[] arr = new int[26];

     for(char ch:magazine.toCharArray())
      arr[ch-'a']++;

     for(char ch:ransomNote.toCharArray()) 
     {
        if(arr[ch-'a']==0)
           return false;
        arr[ch-'a']--;
     } 
     return true;  
    }
}