/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//detectCapital



class Solution {
    public boolean detectCapitalUse(String word) {

     String Upper_Word = word.toUpperCase();

     String Lower_Word = word.toLowerCase();

     String onecap = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

     if(word.equals( Upper_Word))
       return true;
    
      else if(word.equals( Lower_Word))
       return true;

      else if(word.equals( onecap))
       return true;


     return false;


    // //gives correct ans
    // return word.equals(word.toUpperCase()) ||
    //     word.substring(1).equals(word.substring(1).toLowerCase());


    

    }
}
Console
