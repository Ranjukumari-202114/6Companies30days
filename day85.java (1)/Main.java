/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1051. Height Checker




class Solution {
    public int heightChecker(int[] heights) {
     int n = heights.length;
     int expected[] = Arrays.copyOfRange(heights,0,n);
     Arrays.sort(expected); 
     int count = 0;

     for(int i=0; i<n; i++)
     {
        if(heights[i] != expected[i])
          count++; 
     } 
     return count; 
    }
}