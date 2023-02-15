/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


171. Excel Sheet Column Number



class Solution {
    public int titleToNumber(String columnTitle) {
      int res = 0;
        for(int i=0; i<columnTitle.length(); i++){
            res = res*26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;   
    }
}
