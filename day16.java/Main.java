/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    /* int len = numbers.length;
      for(int i = 0; i < len-1; i++){
            int find = target - numbers[i];
            for(int j = i + 1; j < len; j++){
                if(numbers[j] == find){
                    return new int[]{i + 1, j + 1};
                }else if(numbers[j] > find)
                    break;
            }
        }
        return null;
       */
       
       int[] result = new int[2];
        int low = 0, high = numbers.length - 1;
        if(numbers.length < 2) return null;
        while(low < high){
            int sum = numbers[low] + numbers[high];
            if(sum == target){
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            }else if(sum > target)
                high--;
            else
                low++;
        }
        return low >= high ? null : result;  
    }
}