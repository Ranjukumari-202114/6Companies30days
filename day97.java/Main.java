/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1009. Complement of Base 10 Integer



class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
          return 1;
      
         String s = Integer.toBinaryString(n);
         System.out.println(s);
         
         String newString = new String();
         for (int i = 0; i < s.length(); i++) 
         {
         
                 if(s.charAt(i) == '1')
                     newString += "0";
                 else
                    newString += "1";
         }

         return Integer.parseInt(newString,2);
        
    }
}
