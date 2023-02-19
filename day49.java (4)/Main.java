/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



504. Base 7





class Solution {
    public String convertToBase7(int num) {
     
     /* StringBuilder ans = new StringBuilder();
      if(num == 0) return "0";
      int x = num; 
      num = Math.abs(num);
       while(num != 0)
       {
           ans.append(num%7);
           num=num/7;
       }
       if(x < 0)
       {
           ans.append("-");
       }
       return ans.reverse().toString();

  */
  
  
  
  if(num < 0)return "-" + convertToBase7(-num);
        else if(num < 7) return Integer.toString(num);
        else
            return convertToBase7(num/7) + convertToBase7(num%7);

    }
}