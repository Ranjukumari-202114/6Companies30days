/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//796. Rotate String




class Solution {
    public boolean rotateString(String ss, String goal) {

     int n = ss.length();
     if(ss.length() != goal.length())
         return false;

     String doublestr = ss+ss;

     boolean bool = doublestr.contains(goal);
            return bool;

    }
}