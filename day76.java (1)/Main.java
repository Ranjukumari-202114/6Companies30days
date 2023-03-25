/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//2000. Reverse Prefix of Word



class Solution {
    public String reversePrefix(String word, char ch) {
     char[] arr = word.toCharArray();
     int left = 0;
     int right = word.indexOf(ch);
     while(left<right)
     {
         char temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         left++;
         right--;
         
     } 
     return new String(arr); 
    }
}