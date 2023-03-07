/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2187. Minimum Time to Complete Trips



class Solution {
    public long minimumTime(int[] time, int totalTrips) {
     return bs(0, Long.MAX_VALUE, time, totalTrips);
    }
    private long bs(long left, long right, int[] time, long totalTrips) {
        if (left > right) {
            return Long.MAX_VALUE;
        }
        long mid = (left + right) >> 1;
        return isPossible(time, mid, totalTrips)
                ? Math.min(mid, bs(left, mid - 1, time, totalTrips))
                : bs(mid + 1, right, time, totalTrips);
    }

      private boolean isPossible(int[] time, long mid, long totalTrips) {
        long count = 0;
        for (int i : time) {
            count += mid / i;
            if (count >= totalTrips) {
                return true;
            }
        }
        return false; 
    }
}