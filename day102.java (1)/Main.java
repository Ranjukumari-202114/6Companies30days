/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1528. Shuffle String




class Solution {
    public String restoreString(String s, int[] indices) {
      char[] ch  = new char[indices.length];
      for(int i=0; i<indices.length; i++)
      {
          ch[indices[i]] = s.charAt(i);

      } 
     String str = new String(ch); 
     return str; 
     
    }
  
}