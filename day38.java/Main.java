/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int strStr(String haystack, String needle) {
     for(int i=0;i<haystack.length()-needle.length()+1;i++)
     {
         if(haystack.charAt(i) == needle.charAt(0))
         {
             if(haystack.substring(i,needle.length()+i).equals(needle))
             {
                 return i;
             }
         }
     }
      return -1;
    }
}