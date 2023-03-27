/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//520. Detect Capital


class Solution {
    public boolean detectCapitalUse(String word) {
    return word.equals(word.toUpperCase()) ||
        word.substring(1).equals(word.substring(1).toLowerCase());
   }
   
}