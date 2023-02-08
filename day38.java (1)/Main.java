/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;
        while(index<str1.length())
        {
            if(str1.charAt(index) == str2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
            
        }
       return index ==0?"":str1.substring(0,index);
    }
}