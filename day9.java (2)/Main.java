/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int n = nums.length;
      
      List<Integer> arrayList = new ArrayList<Integer>();
      for(int i=0;i<n;++i)
      {
          int index = Math.abs(nums[i])-1;
          if(nums[index] < 0)
             arrayList.add(Math.abs(nums[i]));
           nums[index] = -nums[index];
      } 
      return arrayList;
    }
}
