/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
    int i=0;
    int j=0;
    int ans = 0;
    while(i<nums1.length && j<nums2.length)    //two pointer concept
    {
        if(nums1[i] >nums2[j])
        {
            i++;
        }
        else
        {
           ans=Math.max(ans,j-i);
           j++;
        }
    } 
    return ans;   
    }
}
