/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//836. Rectangle Overlap





class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
     if(rec1[2]<=rec2[0] || rec1[1] >=rec2[3] ||rec1[0]>=rec2[2] || rec1[3]<=rec2[1]) //these are not overlap condition
      {
          return false;
      }
      return true; 

      

    }
}