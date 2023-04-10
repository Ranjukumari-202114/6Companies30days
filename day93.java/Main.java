/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1662. Check If Two String Arrays are Equivalent



class Solution {
   public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {

     String s1 = "";
     String s2 = "";
     for(int i = 0; i<word1.length;i++)
     {
         s1 = s1+word1[i];
     } 
     for(int j = 0; j<word2.length;j++)
     {
         s2 = s2+word2[j];
     }
     if(s1.equals(s2))
     {
        return true;
     }
     return false;

    }
}