/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1046. Last Stone Weight




class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> queue = new  PriorityQueue<>(Collections.reverseOrder());
      
     for(int i : stones)
      queue.add(i);

     int x = 0;
     int y = 0;

     while(queue.size() >1)
     {
         y = queue.poll();
         x = queue.poll();

         if(y > x)
           queue.offer(y-x);
     }
     return queue.isEmpty() ? 0 : queue.poll();
    }
}