/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     
     /*int res = 0;
     for(int i=0;i<nums.length;i++)
     {
         {
             int sum = 0;
             for(int j=i;j<nums.length;j++)     //o(n^2) timecomplexity
            {
                 sum=sum+nums[j];
                 if(sum%k == 0)
                 {
                     res++;
                 }
             }
         }
     } 
     return res;   
     */

    //using hashtable and o(n) timecomplexity
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int count = 0, sum = 0;
    for(int a : nums) {
        sum = (sum + a) % k;
        if(sum < 0) sum += k;  // Because -1 % 5 = -1, but we need the positive mod 4
        count += map.getOrDefault(sum, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;

    }

}