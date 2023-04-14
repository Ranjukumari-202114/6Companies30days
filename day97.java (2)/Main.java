/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1816. Truncate Sentence



class Solution {
    public String truncateSentence(String s, int k) {
     String[] arr = s.split(" ");
     StringBuilder sb = new StringBuilder();

     for(int i=0;i<k; i++)
     {
         sb.append(arr[i]+" ");
     }  
     return sb.toString().trim(); 
    }
}
