/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
            left = mid + 1;
            }
            else {
            right = mid;
            }
         }
         return left;
        
    }
}
