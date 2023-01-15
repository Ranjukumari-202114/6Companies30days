/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     int end = letters.length-1;
     int start = 0;
     char ans= letters[0];
      while(start<=end)
      {
        int mid = start+(end-start)/2;
        if(target > letters[mid])
        {
            start = mid+1;
        }
        else if(letters[mid] == target)
        {
            start = mid+1;
        }
        else
        {
            ans = letters[mid];
            end = mid-1;
        }
      }
      return ans;

    }
}