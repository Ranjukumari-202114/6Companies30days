/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1588. Sum of All Odd Length Subarrays





class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
     // Stores the sum
    int sum = 0;
  
    // Size of array
    int l = arr.length;
  
    // Traverse the array
    for(int i = 0; i < l; i++)
    {
         
        // Generate all subarray of
        // odd length
        for(int j = i; j < l; j += 2)
        {
            for(int k = i; k <= j; k++)
            {
                 
                // Add the element to sum
                sum += arr[k];
            }
        }
    }
     
    // Return the final sum
     return sum;

/*
     int n = arr.length;
        int[] presum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            presum[i + 1] = presum[i] + arr[i];
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; i + j < n; j += 2) {
                res += presum[i + j + 1] - presum[i];
            }
        }
        return res; 
        */
    }
}