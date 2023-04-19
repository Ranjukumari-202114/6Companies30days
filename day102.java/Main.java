/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//771. Jewels and Stones



class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int count  = 0;
     for(int i=0; i<stones.length(); i++)
     {
         for(int j = 0; j<jewels.length(); j++)
         {
             if(stones.charAt(i) == jewels.charAt(j))
                 count++;
         }
     } 
     return count;  
    }
}