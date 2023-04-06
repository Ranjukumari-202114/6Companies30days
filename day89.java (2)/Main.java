/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1221. Split a String in Balanced Strings





class Solution {
    public int balancedStringSplit(String s) {
     int n = s.length();
     if(n == 0)
       return 0;
     int ans = 0;
     int l=0,r=0;
     for(int i = 0; i<n; i++)
     {
       if(s.charAt(i) == 'L')
        {
            l++;
        } 
        else if(s.charAt(i) == 'R')
        {
            r++;
        }
        if(l == r)
        {
            ans++;
        }
     }
     return ans;     
    }
    
}