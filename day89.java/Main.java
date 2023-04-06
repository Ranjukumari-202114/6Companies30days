/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1217. Minimum Cost to Move Chips to The Same Position





class Solution {
    public int minCostToMoveChips(int[] position) {
     int even = 0;
     int odd = 0;
     for(int i: position)
       {
           if(i%2 == 0)
              even++;
           else
              odd++;
       } 
       return Math.min(even,odd); 
    }
}