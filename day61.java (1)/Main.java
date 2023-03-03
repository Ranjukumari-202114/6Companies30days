/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/





//1979. Find Greatest Common Divisor of Array





class Solution {
    public int findGCD(int[] nums) {
     /* Arrays.sort(nums);
        int minNum = nums[0], maxNum = nums[nums.length - 1];
        return gcd(minNum, maxNum);  
    }

    public int gcd(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b % a == 0)
            return a;
        return gcd(a, b % a);
    }

    */
    int min = 1000, max=0;
    for(int i=0;i<nums.length; i++)
    {
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);

    }
    int ans = 0;
    for(int i = 1; i<=min; i++)
    {
        if(min%i == 0 && max%i == 0)
        {
            ans =i;
        }
    }
    return ans;
  }
}