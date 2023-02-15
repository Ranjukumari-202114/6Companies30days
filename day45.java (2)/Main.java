/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



168. Excel Sheet Column Title




class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuffer s = new StringBuffer();
       while(columnNumber>0)
       {
           s.append((char)('A'+(--columnNumber)%26));
           columnNumber = columnNumber/26;
       }
        return s.reverse().toString();
    }
}