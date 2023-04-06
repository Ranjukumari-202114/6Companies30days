/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1184. Distance Between Bus Stops




class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int nstart = Math.min(start,destination);
        int  nend = Math.max(start,destination); 
        return Math.min(clockwise(distance,nstart,nend),anticlockwise(distance,nend,nstart));
    }

    public int clockwise(int[] distance, int start, int end)
    {
      int cost = 0;
      for(int i=start; i<end; i++)
         cost = cost+distance[i];
      return cost;
    }
    
    public int anticlockwise(int[] distance, int start, int end)
    {
      int cost = 0;
      int n = distance.length;
      int i=start; 
      while(i%n != end){

         cost = cost+distance[i%n];
         i++;
      }
      return cost;
    }



}

