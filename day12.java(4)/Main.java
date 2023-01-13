/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
     if(k<1)
     {
         return 0;
     }
     int ans = 0;
     int left = 0,temp = 0;
     int right = cardPoints.length-1;
     while(left<k) 
     {
          temp = temp+cardPoints[left];
          left++;
     } 
     ans = temp;
     left--;
     while(left>=0)
     {
         temp = temp-cardPoints[left];
         temp = temp+cardPoints[right];
         left--;
         right--;
         ans = Math.max(ans,temp);
     } 
     return ans;
    }
}
