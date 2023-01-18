/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        String result ="";
        int i=0;
        int a_length = a.length();
        int b_length = b.length();
        while(i<a_length || i<b_length || carry != 0)
        {
            int x = 0;
            if(i<a_length && a.charAt(a_length-1-i) == '1') x=1;
            int y=0;
            if(i<b_length && b.charAt(b_length-1-i) =='1') y=1;


            result = (x+y+carry)%2+result;
            carry = (x+y+carry)/2;
            i++;
        }

        return result;
    }
}