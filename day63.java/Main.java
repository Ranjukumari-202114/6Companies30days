/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1232. Check If It Is a Straight Line



class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
    
    /*
    //wrong  ans

     double slope = Calculate(coordinates[0],coordinates[1]);
     for(int i =2; i<coordinates.length;i++)
     {
         if(slope !=Calculate(coordinates[0],coordinates[i]))
         {
             return false;
         }
         
     } 
     return true;
     }

     private double Calculate(int[] p1, int[] p2)
     {
         return ((p1[1]-p2[1])*1.0)/((p1[0]-p2[0])*1.0);
     } 

  */

    int x0 = coordinates[0][0];
    int y0 = coordinates[0][1];
    int x1 = coordinates[1][0];
    int y1 = coordinates[1][1];
    int dx = x1 - x0;
    int dy = y1 - y0;

    for (int i = 2; i < coordinates.length; ++i) {
      int x = coordinates[i][0];
      int y = coordinates[i][1];
      if ((x - x0) * dy != (y - y0) * dx)
        return false;
    }

    return true; 
    }
    
}
