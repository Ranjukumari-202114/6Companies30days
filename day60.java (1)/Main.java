/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1742. Maximum Number of Balls in a Box



class Solution {
    public int countBalls(int lowLimit, int highLimit) {
      
      int[] box = new int[50];
      int ans =0;
      for(int i =lowLimit; i<= highLimit; i++)
      {
          int sum=0;
          int temp = i;
          
          while(temp!=0)
          {
              sum += temp%10;
              temp=temp/10;
              
          } 
          box[sum]++;
          ans = Math.max(ans, box[sum]);
        } 
        return ans; 
    }
}