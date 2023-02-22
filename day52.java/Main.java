/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


1011. Capacity To Ship Packages Within D Days




class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int left = 0, right = 0;
        for (int w: weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, requirement = 1, tillnow = 0;
            for (int w: weights) {
                if (tillnow + w > mid) {
                   requirement += 1;
                   tillnow = 0;
                }
                tillnow += w;
            }
            if (requirement > days) left = mid + 1;
            else right = mid;
        }
        return left;

    }
}