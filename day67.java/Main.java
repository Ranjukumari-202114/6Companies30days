/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//38. Count and Say






class Solution {
    public String countAndSay(int n) {
     if(n==1) return "1";
     if(n==2) return "11";  
     String s = "11";
     for(int i = 3; i<=n; i++)
     {  
        s=s+'&'; 
        String t="";
        int count = 1;
        for(int j=1; j<s.length(); j++)
        {
            if(s.charAt(j) != s.charAt(j-1))
            {
               t = t+Integer.toString(count);
               t = t+s.charAt(j-1);
               count =1;
            }
            else
             count++;
        }
        s=t;
     }
     return s;
    }
}
