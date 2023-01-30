/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public int[] constructRectangle(int area) {
     int width = (int) Math.sqrt(area);

     while (area % width > 0)
      --width;

     return new int[] {area / width, width};   
    }
}