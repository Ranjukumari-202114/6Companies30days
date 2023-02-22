/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//875. Koko Eating Bananas




/*class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int left = 1; 
     int right =Arrays.stream(piles).max().getAsInt();
        while (left < right) {
            int mid = (left + right) / 2, total = 0;
            for (int p : piles) total += (p + mid - 1) / mid;
            if (total > h) left = mid + 1; else right = mid;
        }
        return left;
     

    }
}
*/



class Solution {
   private boolean check(int[] bananas, int mid_val, int h)
    {
    int time = 0;
    for (int i = 0; i < bananas.length; i++) {
 
        // to get the ceil value
        if (bananas[i] % mid_val != 0) {
 
            // in case of odd number
            time += ((bananas[i] / mid_val) + 1);
        }
        else {
 
            // in case of even number
            time += (bananas[i] / mid_val);
        }
    }
 
    // check if time is less than
    // or equals to given hour
    if (time <= h) {
        return true;
    }
    else 
    {
        return false;
    }

    }
    
  public int minEatingSpeed(int[] piles, int h) {
      // as minimum speed of eating must be 1
    int start = 1;
 
    // Maximum speed of eating
    // is the maximum bananas in given piles
    int end = Arrays.stream(piles).max().getAsInt();
 
    while (start < end) {
        int mid = start + (end - start) / 2;
 
        // Check if the mid(hours) is valid
        if ((check(piles, mid, h)) == true) {
 
            // If valid continue to search
            // lower speed
            end = mid;
        }
        else {
            // If cant finish bananas in given
            // hours, then increase the speed
            start = mid + 1;
        }
    }
    return end;
    }


    

}
