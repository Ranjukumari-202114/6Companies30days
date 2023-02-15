/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


202-happy-number


class Solution {
    public boolean isHappy(int n) {
     Set <Integer> set  = new HashSet<>();
     while(n != 1 && !set.contains(n))
     {
       set.add(n);
       int sum = 0; 
       while(n>0)
       {
         sum+= Math.pow((n%10),2);
         n/=10;
       }  
       n=sum; 
    }
    return n==1;
    }
}