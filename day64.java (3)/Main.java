/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2455. Average Value of Even Numbers That Are Divisible by Three




class Solution {
    public int averageValue(int[] nums) {
    int sum =0;
    int count=0;
    for(int i =0; i<nums.length; i++)
    {
      if(nums[i]%2 == 0 && nums[i]%3 ==0)
      {
          sum = sum+nums[i];
          count++;
      }
    }
    if(count == 0)
    {
        return 0;
    } 
    return sum/count;   

    
    /*int sum = 0;
    int count = 0;

    for (final int num : nums)
      if (num % 6 == 0) {
        sum += num;
        ++count;
      }

    return count == 0 ? 0 : sum / count;
    */
    }
}
