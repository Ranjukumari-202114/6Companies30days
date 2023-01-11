/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxArea(int[] height) {

    int left = 0;
     int right = height.length-1;
     int max_area=0;
     while(left<right)
     {
        /* int lh  = height[left];
         int rh = height[right];
         int min_h = Math.min(lh,rh);
         int len = right-1;
         int curr_area = min_h*len;
         max = Math.max(max_area,curr_area);
         if(lh<rh)
           left++;
         else
           right--;
           */
         // Shorter pole/vertical line
            int shorterLine = Math.min(height[left], height[right]);
            // Update maximum area if required
            max_area = Math.max(max_area, shorterLine * (right - left));
            // If there is a longer vertical line present
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

     }
     
     return max_area;  
     

   /*int max_area = 0;
   int n = height.length;
   for(int i =0;i<n;i++)                // using o(n^2)  timecomplexity
   {
       for(int j=i;j<n;j++)
       {
           int curr_area = (j-i)*Math. min(height[i],height[j]);
           max_area = Math.max(curr_area,max_area);
       }
   }
   return max_area;
  */



    }
}