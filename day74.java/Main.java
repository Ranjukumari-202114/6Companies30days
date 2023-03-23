/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//344. Reverse String



class Solution {
    public void reverseString(char[] s) {
      int n = s.length;
      for(int i=0;i<n/2;i++){
         s[i] = (char)(s[i]+s[n-i-1]);
         s[n-i-1] = (char)(s[i]-s[n-i-1]);
         s[i] = (char)(s[i]-s[n-i-1]);
        
      }
      return ;


      // int i=0;
      // int j=s.length-1;
      // while(i<j)
      // {
      //   char temp = s[i];
      //   s[i] = s[j];
      //   s[j] = temp;
      //   i++;
      //   j--;
      // }


      // public String reverseString(String s) {
      //   int left = 0, right = s.length() - 1;
      //   char[] chars = s.toCharArray();
      //   while (left < right) {
      //       char tmp = chars[left];
      //       chars[left] = chars[right];
      //       chars[right] = tmp;
      //       left ++;
      //       right --;
      //   }
      //   return new String(chars);
       // }

      
    }
}
