/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int mySqrt(int x) {

      if (x == 0 || x == 1)
            return x;
      int right = x / 2;
        int left = 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if ((long)mid*mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}