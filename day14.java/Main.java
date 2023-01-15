/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int maximumCount(int[] nums) {
       return (int) Math.max(Arrays.stream(nums).filter(num -> num > 0).count(),
                          Arrays.stream(nums).filter(num -> num < 0).count()); 
        
    }
}
