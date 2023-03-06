/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//908. Smallest Range I



class Solution {
    public int smallestRangeI(int[] nums, int k) {
     int min = nums[0] ,max = nums[0];
     for(int i =0; i<nums.length; i++)
     {
         min = Math.min(min,nums[i]);
         max = Math.max(max,nums[i]);
     }
     if(min+k >= max-k)
        return 0;

     else
        return ((max-k) - (min+k));


   }
}


  
  
  
   /* class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        
        for (int x: A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
    }
}   
*/

