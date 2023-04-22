/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//496. Next Greater Element I


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    int j;
    for (int i = 0; i < nums1.length; i++) {
      boolean found = false;
      for (j = 0; j < nums2.length; j++) {
        if (found && nums2[j] > nums1[i]) {
          res[i] = nums2[j];
          break;
        }
        if (nums2[j] == nums1[i]) {
          found = true;
        }
      }
      if (j == nums2.length) {
        res[i] = -1;
      }
    }

    return res;  
    }
}