/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2404. Most Frequent Even Element



class Solution {
    public int mostFrequentEven(int[] nums) {
    HashMap<Integer,Integer>counts =new HashMap<>();
            for(int i:nums)
            {
            if(i%2==0)                    
                    counts.put(i,counts.getOrDefault(i,0)+1);                                               }
            int ans=-1 ,maxFreq=-1;
            
            for(Integer num:counts.keySet()){
                    
                if(counts.get(num)>maxFreq){
                   maxFreq=counts.get(num);
                        ans=num;
                }
                else if(counts.get(num)==maxFreq && ans>num){
                        ans=num;                        
                }                    
            }
            return ans;
    }
}