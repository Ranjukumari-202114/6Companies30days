/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m-1,p2 = n-1, i=m+n-1;
      while(p2 >= 0)
      {
          if(p1>= 0 && nums1[p1] > nums2[p2])
          {
              nums1[i--]  = nums1[p1--];         
           }
           else
           {
               nums1[i--] = nums2[p2--];
           }
      } 
       
    }
}