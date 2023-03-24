/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//917. Reverse Only Letters




class Solution {
  private boolean isAlphabate(char c)
  {
    if((c >= 'a' && c<= 'z') || (c >= 'A'&& c<= 'Z'))
    {
      return true;
    }
    return false;
  }

  public String reverseOnlyLetters(String s) 
  {
    // Two pointer approach
      int left = 0;
      int right= s.length()-1;
      char[] sCharArray = s.toCharArray();
    while(left<right)
    {
        if(!isAlphabate(sCharArray[left]))
        {
          left++;
        }
        if(!isAlphabate(sCharArray[right]))
        {
          right--;
        }
       if(isAlphabate(sCharArray[left]) && isAlphabate(sCharArray[right]))
       {
          char  temp = sCharArray[left];
          sCharArray[left] = sCharArray[right];
          sCharArray[right] = temp;
          left++;
          right--;
       }
    }
    return new String(sCharArray);
  }
}