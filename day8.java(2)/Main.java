/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      /* int n= nums.length;
       List<List<Integer>> array = new ArrayList<List<Integer>>();
       Set<List<Integer>> set = new HashSet<>(); 
      for(int i=0;i<n-2;i++)
      {
          for( int j=i+1;j<n-1;j++)
          {
              for(int k=j+1;k<n;k++)
              {
                  if((nums[i]+nums[j]+nums[k]) == 0)
                  {
                    List<Integer> subArray = new ArrayList<>();
					subArray.add(nums[i]);
					subArray.add(nums[j]);
					subArray.add(nums[k]);
					Collections.sort(subArray);
					set.add(subArray);
                   }
              }                                 o(n^3) time complexity
          }
      }
      array.addAll(set);
	return array;       */

         Set<List<Integer>> res = new HashSet<>();
         int n= nums.length;
         if(nums.length==0)
          {
             return new ArrayList<>(res);
          }
           Arrays.sort(nums);
           for(int i=0;i<n-2;i++)
           {
                int j=i+1;
               int  k = n-1;
               while(j<k)
               {
                   int sum = nums[j]+nums[k];
                   if(sum == -nums[i])
                   {
                       res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                   }
                   else if(sum >-nums[i])
                   {
                       k--;
                   }
                   else if(sum<-nums[i])
                   {
                       j++;
                   }

               }
           }
        
        return new ArrayList<>(res);

    }
}